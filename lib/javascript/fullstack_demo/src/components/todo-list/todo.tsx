import { Todo } from '@/models';
import { TrashIcon } from 'lucide-react';

export type TodoProps = {
  todo: Todo;
  onToggle?: (id: number) => void;
  onDelete?: (id: number) => void;
};

export const TodoComponent: React.FC<TodoProps> = ({
  todo,
  onToggle,
  onDelete,
}) => {
  const onToggleFn = onToggle || (() => {});
  const onDeleteFn = onDelete || (() => {});

  return (
    <li key={todo.id} className="todo flex items-center space-x-3">
      <input
        type="checkbox"
        checked={todo.completed}
        onChange={() => onToggleFn(todo.id)}
        className="h-4 w-4 text-indigo-600 focus:ring-indigo-500 border-gray-300 rounded"
      />
      <span
        className={`flex-1 ${
          todo.completed ? 'line-through text-gray-500' : 'text-gray-900'
        }`}
      >
        {todo.text}
      </span>
      <button
        onClick={() => onDeleteFn(todo.id)}
        className="flex items-center justify-center h-8 w-8 rounded-full bg-red-100 text-red-600 hover:bg-red-200 focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-red-500"
      >
        <TrashIcon className="h-5 w-5" aria-hidden="true" />
      </button>
    </li>
  );
};
