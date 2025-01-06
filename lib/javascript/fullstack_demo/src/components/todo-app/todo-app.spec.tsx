import { Todo } from '@/models';
import { render, screen, waitFor } from '@testing-library/react';
import { beforeEach, describe, expect, test } from 'vitest';
import { TodoApp } from './todo-app';

describe('TodoApp', () => {
  beforeEach(() => {
    fetchMock.resetMocks();
  });

  test('initializes correctly', async () => {
    // Arrange
    fetchMock.mockResponseIf(
      new URL('/api/todos', process.env.NEXT_PUBLIC_API_URL).toString(),
      JSON.stringify([
        { id: 1, text: 'Todo 1', completed: false },
        { id: 2, text: 'Todo 2', completed: true },
      ] as Todo[]),
    );

    // Act
    render(<TodoApp />);

    // Assert
    await waitFor(() => expect(fetchMock).toHaveBeenCalledTimes(1));
    expect(
      screen.getByRole('heading', { level: 1, name: 'Todo App' }),
    ).toBeDefined();
  });
});
