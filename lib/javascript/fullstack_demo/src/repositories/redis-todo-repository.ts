import { Todo } from '@/models';
import { Redis } from '@upstash/redis';
import { TodoRepository } from './todo-repository';

export class RedisTodoRepository implements TodoRepository {
  constructor(private readonly redis: Redis) {}

  async getAll(userId: string): Promise<Todo[]> {
    const todos = (await this.redis.get(`todos:${userId}`)) as Todo[];
    return todos || [];
  }

  async create(todo: Todo, userId: string): Promise<number> {
    const todos = (await this.redis.get(`todos:${userId}`)) as [];
    const updatedTodos = [...(todos || []), { ...todo, id: Date.now() }];
    await this.redis.set(`todos:${userId}`, updatedTodos);
    return todo.id;
  }

  async patch(todo: Partial<Todo>, userId: string): Promise<Todo | undefined> {
    const todos = (await this.redis.get(`todos:${userId}`)) as Array<Todo>;
    const updatedTodos = todos.map((t) =>
      t.id === todo.id ? { ...t, ...todo } : t,
    );
    await this.redis.set(`todos:${userId}`, updatedTodos);
    const updated = updatedTodos.find((t) => t.id === todo.id);
    return updated;
  }

  async delete(id: number, userId: string): Promise<void> {
    const todos = (await this.redis.get(`todos:${userId}`)) as Array<Todo>;
    const updatedTodos = todos.filter((todo) => todo.id != Number(id));
    await this.redis.set(`todos:${userId}`, updatedTodos);
    return;
  }
}
