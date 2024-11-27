import { Todo } from '@/models';

export interface TodoRepository {
  getAll: (userId: string) => Promise<Todo[]>;
  create: (todo: Todo, userId: string) => Promise<number>;
  patch(todo: Partial<Todo>, userId: string): Promise<Todo | undefined>;
  delete: (id: number, userId: string) => Promise<void>;
}
