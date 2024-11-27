import { createTodoRepository } from '@/repositories';
import { auth } from '@clerk/nextjs/server';
import { NextResponse } from 'next/server';

const todoRepository = createTodoRepository();

/**
 * Retrieve all todos by user
 *
 * @returns {Response}
 */
export async function GET() {
  const { userId } = await auth();

  if (!userId) {
    return new Response('Unauthorized', { status: 401 });
  }

  try {
    const todos = await todoRepository.getAll(userId);
    return NextResponse.json(todos || []);
  } catch (error) {
    console.error('Error fetching todos:', error);
    return new Response('Internal Server Error', { status: 500 });
  }
}

/**
 * Post a new todo
 *
 * @param request Request
 * @returns {Response}
 */
export async function POST(request: Request) {
  const { userId } = await auth();

  if (!userId) {
    return new Response('Unauthorized', { status: 401 });
  }

  const todo = await request.json();

  try {
    const id = await todoRepository.create(todo, userId);
    return NextResponse.json(id);
  } catch (error) {
    console.error('Error creating todo:', error);
    return new Response('Internal Server Error', { status: 500 });
  }
}
