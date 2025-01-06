import { Todo } from '../models';
import { TodoRepository } from './todo-repository';

export interface DbTables {
  todos: {
    userId: string;
    items: Todo[];
  }[];
}

interface JsonDb {
  data: DbTables;
  write: () => Promise<void>;
}

export class JsonTodoRepository implements TodoRepository {
  constructor(private db: JsonDb) {}

  async getAll(userId: string): Promise<Todo[]> {
    const todos =
      this.db.data.todos.find((todo) => todo.userId === userId)?.items || [];
    return todos;
  }

  async create(todo: Todo, userId: string): Promise<number> {
    const userTodos = this.db.data.todos.find(
      (todos) => todos.userId === userId,
    );
    const id = todo.id ?? Date.now();
    if (userTodos) {
      userTodos.items.push({ ...todo, id });
    } else {
      this.db.data.todos.push({ userId, items: [{ ...todo, id: Date.now() }] });
    }
    await this.db.write();
    return id;
  }

  async patch(todo: Partial<Todo>, userId: string): Promise<Todo | undefined> {
    let userTodos = this.db.data.todos.find((todos) => todos.userId === userId);
    if (!userTodos) {
      userTodos = { userId, items: [] };
      this.db.data.todos.push(userTodos);
    }
    let updatedTodo = userTodos?.items.find((t) => t.id === todo.id);
    if (userTodos && updatedTodo) {
      updatedTodo = { ...updatedTodo, ...todo };
      const items = userTodos.items.map((t) =>
        t.id === todo.id ? updatedTodo! : t,
      );
      userTodos.items = items;
    }
    await this.db.write();
    return updatedTodo;
  }

  async delete(id: number, userId: string): Promise<void> {
    const userTodos = this.db.data.todos.find(
      (todos) => todos.userId === userId,
    );
    if (userTodos) {
      userTodos.items = userTodos.items.filter((todo) => todo.id !== id);
      await this.db.write();
    }
  }
}
