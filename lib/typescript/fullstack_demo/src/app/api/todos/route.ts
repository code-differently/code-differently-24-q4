import { auth } from '@clerk/nextjs/server';
import { Redis } from '@upstash/redis';
import { NextResponse } from 'next/server';

const redis = new Redis({
  url: process.env.KV_REST_API_URL,
  token: process.env.KV_REST_API_TOKEN,
});

export async function GET() {
  const { userId } = await auth();

  if (!userId) {
    return new Response('Unauthorized', { status: 401 });
  }

  try {
    const todos = await redis.get(`todos:${userId}`);
    return NextResponse.json(todos || []);
  } catch (error) {
    console.error('Error fetching todos:', error);
    return new Response('Internal Server Error', { status: 500 });
  }
}

// Post a new todo
export async function POST(request: Request) {
  const { userId } = await auth();

  if (!userId) {
    return new Response('Unauthorized', { status: 401 });
  }

  const todo = await request.json();

  try {
    const todos = (await redis.get(`todos:${userId}`)) as [];
    const updatedTodos = [...(todos || []), { ...todo, id: Date.now() }];
    await redis.set(`todos:${userId}`, updatedTodos);
    return NextResponse.json(updatedTodos);
  } catch (error) {
    console.error('Error creating todo:', error);
    return new Response('Internal Server Error', { status: 500 });
  }
}
