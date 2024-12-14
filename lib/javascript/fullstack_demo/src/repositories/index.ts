export type { TodoRepository } from './todo-repository';

import { JsonTodoRespository } from './json-todo-repository';
import { RedisTodoRepository } from './redis-todo-repository';
import { TodoRepository } from './todo-repository';

export function createTodoRepository(): TodoRepository {
  if (process.env.DB_TYPE?.toUpperCase() === 'REDIS') {
    return new RedisTodoRepository();
  }
  return new JsonTodoRespository();
}
