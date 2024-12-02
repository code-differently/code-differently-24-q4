'use client';

import { Todo } from '@/models';
import { useAuth } from '@clerk/clerk-react';
import { useEffect, useState } from 'react';
import { AddTodo } from '../add-todo';
import { TodoList } from '../todo-list';

const API_HOST = import.meta.env.VITE_API_HOST || '';

export const TodoApp: React.FC = () => {
  const { getToken } = useAuth();
  const [todos, setTodos] = useState<Todo[]>([]);

  useEffect(() => {
    fetchTodos();
  }, []);

  const fetchTodos = async () => {
    const response = await fetch(`${API_HOST}/api/todos`, {
      headers: {
        Authorization: `Bearer ${await getToken()}`,
      },
    });
    const data = await response.json();
    setTodos(data);
  };

  return (
    <div className="min-h-screen bg-gray-100 py-6 flex flex-col justify-center sm:py-12">
      <div className="relative py-3 sm:max-w-xl sm:mx-auto">
        <div className="absolute inset-0 bg-gradient-to-r from-cyan-400 to-light-blue-500 shadow-lg transform -skew-y-6 sm:skew-y-0 sm:-rotate-6 sm:rounded-3xl"></div>
        <div className="relative px-4 py-10 bg-white shadow-lg sm:rounded-3xl sm:p-20">
          <div className="max-w-md mx-auto">
            <div className="divide-y divide-gray-200">
              <div className="py-8 text-base leading-6 space-y-4 text-gray-700 sm:text-lg sm:leading-7">
                <h1 className="text-3xl font-extrabold text-center">
                  Todo App
                </h1>
                <AddTodo onAdd={fetchTodos} />
              </div>
              <TodoList todos={todos} onChange={fetchTodos} />
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
