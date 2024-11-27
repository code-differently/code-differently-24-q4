import { JSONFilePreset } from 'lowdb/node';
import { dirname } from 'path';
import { fileURLToPath } from 'url';
import { Todo } from '../models';
import { TodoRepository } from './todo-repository';

interface DbTables {
  todos: {
    userId: string;
    items: Todo[];
  }[];
}

const __dirname = dirname(fileURLToPath(import.meta.url));
const db = await JSONFilePreset<DbTables>(`${__dirname}/db.json`, {
  todos: [],
});

export class JsonTodoRespository implements TodoRepository {
  async getAll(userId: string): Promise<Todo[]> {
    const todos =
      db.data.todos.find((todo) => todo.userId === userId)?.items || [];
    return todos;
  }

  async create(todo: Todo, userId: string): Promise<number> {
    const userTodos = db.data.todos.find((todos) => todos.userId === userId);
    const id = todo.id ?? Date.now();
    if (userTodos) {
      userTodos.items.push({ ...todo, id });
    } else {
      db.data.todos.push({ userId, items: [{ ...todo, id: Date.now() }] });
    }
    await db.write();
    return id;
  }

  async patch(todo: Partial<Todo>, userId: string): Promise<Todo | undefined> {
    let userTodos = db.data.todos.find((todos) => todos.userId === userId);
    if (!userTodos) {
      userTodos = { userId, items: [] };
      db.data.todos.push(userTodos);
    }
    let updatedTodo = userTodos?.items.find((t) => t.id === todo.id);
    if (userTodos && updatedTodo) {
      updatedTodo = { ...updatedTodo, ...todo };
      const items = userTodos.items.map((t) =>
        t.id === todo.id ? updatedTodo! : t,
      );
      userTodos.items = items;
    }
    await db.write();
    return updatedTodo;
  }

  async delete(id: number, userId: string): Promise<void> {
    const userTodos = db.data.todos.find((todos) => todos.userId === userId);
    if (userTodos) {
      userTodos.items = userTodos.items.filter((todo) => todo.id !== id);
      await db.write();
    }
  }
}
