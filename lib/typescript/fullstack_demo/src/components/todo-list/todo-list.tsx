import { Todo } from '@/models';
import { TodoComponent } from './todo';

export type TodoProps = {
  todos: Todo[];
  onChange?: (id: number) => void;
};

export const TodoList: React.FC<TodoProps> = ({ todos, onChange }) => {
  const toggleTodo = async (id: number) => {
    const todo = todos.find((todo) => todo.id === id);
    if (!todo) return;
    todo.completed = !todo.completed;
    await fetch(`/api/todos/${id}`, {
      method: 'PATCH',
      body: JSON.stringify(todo),
    });
    if (onChange) {
      onChange(todo.id);
    }
  };

  const deleteTodo = async (id: number) => {
    await fetch(`/api/todos/${id}`, {
      method: 'DELETE',
    });
    if (onChange) {
      onChange(id);
    }
  };

  return (
    <div className="pt-6 text-base leading-6 font-bold sm:text-lg sm:leading-7">
      <ul className="space-y-4">
        {todos.map((todo) => (
          <TodoComponent
            key={todo.id}
            todo={todo}
            onToggle={toggleTodo}
            onDelete={deleteTodo}
          />
        ))}
      </ul>
    </div>
  );
};
