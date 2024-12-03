import { Todo } from '@/models';
import { useAuth } from '@clerk/clerk-react';
import { PlusIcon } from 'lucide-react';
import { useState } from 'react';

const API_HOST = import.meta.env.VITE_API_HOST || '';

export type AddTodoProps = {
  onAdd?: (todo: Todo) => void;
};

export const AddTodo: React.FC<AddTodoProps> = ({ onAdd }) => {
  const { getToken } = useAuth();
  const [newTodo, setNewTodo] = useState('');

  const addTodo = async (e: React.FormEvent) => {
    e.preventDefault();
    if (newTodo.trim() !== '') {
      const todo: Todo = { id: Date.now(), text: newTodo, completed: false };
      await fetch(`${API_HOST}/api/todos`, {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
          Authorization: `Bearer ${await getToken()}`,
        },
        body: JSON.stringify(todo),
      });
      setNewTodo('');
      if (onAdd) {
        onAdd(todo);
      }
    }
  };

  return (
    <form onSubmit={addTodo} className="mt-8 space-y-6">
      <div className="rounded-md shadow-sm -space-y-px">
        <div>
          <input
            type="text"
            value={newTodo}
            onChange={(e) => setNewTodo(e.target.value)}
            className="appearance-none rounded-none relative block w-full px-3 py-2 border border-gray-300 placeholder-gray-500 text-gray-900 rounded-t-md focus:outline-none focus:ring-indigo-500 focus:border-indigo-500 focus:z-10 sm:text-sm"
            placeholder="Add a new todo"
          />
        </div>
      </div>
      <div>
        <button
          type="submit"
          className="group relative w-full flex justify-center py-2 px-4 border border-transparent text-sm font-medium rounded-md text-white bg-indigo-600 hover:bg-indigo-700 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-indigo-500"
        >
          <span className="absolute left-0 inset-y-0 flex items-center pl-3">
            <PlusIcon
              className="h-5 w-5 text-indigo-500 group-hover:text-indigo-400"
              aria-hidden="true"
            />
          </span>
          Add Todo
        </button>
      </div>
    </form>
  );
};
