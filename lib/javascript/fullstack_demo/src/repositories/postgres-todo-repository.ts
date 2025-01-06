import { Todo } from '@/models';
import { PrismaClient } from '@prisma/client';
import { TodoRepository } from './todo-repository';

export class PostgresTodoRepository implements TodoRepository {
  constructor(private readonly client: PrismaClient) {}

  async getAll(userId: string): Promise<Todo[]> {
    const dbTodos = await this.client.todos.findMany({
      where: { user_id: userId },
      orderBy: { id: 'asc' },
    });
    return dbTodos.map((todo) => ({
      id: Number(todo.id),
      text: todo.text,
      completed: todo.completed,
    }));
  }

  async create(todo: Todo, userId: string): Promise<number> {
    const dbTodo = await this.client.todos.create({
      data: {
        text: todo.text,
        completed: todo.completed,
        user_id: userId,
      },
    });
    return Number(dbTodo.id);
  }

  async patch(todo: Partial<Todo>, userId: string): Promise<Todo | undefined> {
    const dbTodo = await this.client.todos.update({
      where: { id: todo.id, user_id: userId },
      data: {
        text: todo.text,
        completed: todo.completed,
      },
    });
    return dbTodo
      ? {
          id: Number(dbTodo.id),
          text: dbTodo.text,
          completed: dbTodo.completed,
        }
      : undefined;
  }

  async delete(id: number, userId: string): Promise<void> {
    await this.client.todos.delete({ where: { id, user_id: userId } });
  }
}
