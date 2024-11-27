import { auth } from '@clerk/nextjs/server';
import { Redis } from '@upstash/redis';
import { NextResponse } from 'next/server';

const redis = new Redis({
  url: process.env.KV_REST_API_URL,
  token: process.env.KV_REST_API_TOKEN,
});

/**
 * Delete a todo for a user
 *
 * @param request
 * @param param1
 * @returns {Response}
 */
export async function DELETE(
  request: Request,
  { params }: { params: Promise<{ id: string }> },
) {
  const { userId } = await auth();

  if (!userId) {
    return new Response('Unauthorized', { status: 401 });
  }

  const { id } = await params;

  try {
    const todos = (await redis.get(`todos:${userId}`)) as Array<{ id: number }>;
    const updatedTodos = todos.filter((todo) => todo.id != Number(id));
    await redis.set(`todos:${userId}`, updatedTodos);
    return NextResponse.json(updatedTodos);
  } catch (error) {
    console.error('Error deleting todo:', error);
    return new Response('Internal Server Error', { status: 500 });
  }
}

/**
 * Update a todo for a user
 *
 * @param request
 * @returns {Response}
 */
export async function PATCH(request: Request) {
  const { userId } = await auth();

  if (!userId) {
    return new Response('Unauthorized', { status: 401 });
  }

  const todo = await request.json();

  try {
    const todos = (await redis.get(`todos:${userId}`)) as Array<{ id: number }>;
    const updatedTodos = todos.map((t) => (t.id === todo.id ? todo : t));
    await redis.set(`todos:${userId}`, updatedTodos);
    return NextResponse.json(updatedTodos);
  } catch (error) {
    console.error('Error updating todo:', error);
    return new Response('Internal Server Error', { status: 500 });
  }
}
