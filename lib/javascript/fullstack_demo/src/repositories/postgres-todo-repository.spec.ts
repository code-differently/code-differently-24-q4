import { PrismaClient } from '@prisma/client';
import { beforeEach, describe, expect, it } from 'vitest';
import { DbTodo, FakePrismaClient } from './fakes/fake-prima-client';
import { PostgresTodoRepository } from './postgres-todo-repository';

const INITIAL_TODOS: ReadonlyArray<DbTodo> = [
  {
    id: 1,
    user_id: '1',
    text: 'Buy milk',
    completed: false,
    updated_at: new Date().toISOString(),
  },
  {
    id: 2,
    user_id: '1',
    text: 'Walk the dog',
    completed: true,
    updated_at: new Date().toISOString(),
  },
  {
    id: 3,
    user_id: '2',
    text: 'Do homework',
    completed: false,
    updated_at: new Date().toISOString(),
  },
];

describe('PostgresTodoRepository', () => {
  let repository: PostgresTodoRepository;

  beforeEach(() => {
    const todos = JSON.parse(JSON.stringify(INITIAL_TODOS));
    const fakeClient = new FakePrismaClient({ todos });
    repository = new PostgresTodoRepository(
      fakeClient as unknown as PrismaClient,
    );
  });

  it('should retrieve todos', async () => {
    // Act
    const todos = await repository.getAll('1');

    // Assert
    expect(todos).toEqual([
      { id: 1, text: 'Buy milk', completed: false },
      { id: 2, text: 'Walk the dog', completed: true },
    ]);
  });

  it('should create a todo', async () => {
    // Act
    await repository.create(
      { id: 0, text: 'Take out the trash', completed: true },
      '2',
    );

    // Assert
    const todos = await repository.getAll('2');
    expect(todos).toEqual([
      { id: 3, text: 'Do homework', completed: false },
      { id: 4, text: 'Take out the trash', completed: true },
    ]);
  });

  it('should patch a todo', async () => {
    // Act
    const updatedTodo = await repository.patch(
      { id: 1, text: 'Buy milk', completed: true },
      '1',
    );

    // Assert
    expect(updatedTodo).toEqual({ id: 1, text: 'Buy milk', completed: true });
    expect(await repository.getAll('1')).toEqual([
      { id: 1, text: 'Buy milk', completed: true },
      { id: 2, text: 'Walk the dog', completed: true },
    ]);
  });

  it('should delete a todo', async () => {
    // Act
    await repository.delete(1, '1');

    // Assert
    expect(await repository.getAll('1')).toEqual([
      { id: 2, text: 'Walk the dog', completed: true },
    ]);
  });
});
