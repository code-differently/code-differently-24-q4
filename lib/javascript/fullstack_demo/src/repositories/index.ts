export type { TodoRepository } from './todo-repository';

import { PrismaClient } from '@prisma/client';
import { Redis } from '@upstash/redis';
import { JSONFilePreset } from 'lowdb/node';
import { dirname } from 'path';
import { fileURLToPath } from 'url';
import { DbTables, JsonTodoRepository } from './json-todo-repository';
import { PostgresTodoRepository } from './postgres-todo-repository';
import { RedisTodoRepository } from './redis-todo-repository';
import { TodoRepository } from './todo-repository';

const __dirname = dirname(fileURLToPath(import.meta.url));
const db = await JSONFilePreset<DbTables>(`${__dirname}/db.json`, {
  todos: [],
});

export function createTodoRepository(): TodoRepository {
  if (process.env.DB_TYPE?.toUpperCase() === 'REDIS') {
    const redisClient = new Redis({
      url: process.env.KV_REST_API_URL,
      token: process.env.KV_REST_API_TOKEN,
    });
    return new RedisTodoRepository(redisClient);
  }

  if (process.env.DB_TYPE?.toUpperCase() === 'POSTGRES') {
    const prismaClient = new PrismaClient();
    return new PostgresTodoRepository(prismaClient);
  }

  return new JsonTodoRepository(db);
}
