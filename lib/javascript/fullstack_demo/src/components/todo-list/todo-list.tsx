import { LogEvent, Todo } from '@/models';
import { logger } from '@/util/client-logger';
import { TodoComponent } from './todo';

export type TodoProps = {
  todos: Todo[];
  onChange?: (id: number) => void;
};

export const TodoList: React.FC<TodoProps> = ({ todos, onChange }) => {
  const toggleTodo = async (id: number) => {
    logger.event(LogEvent.TODO_TOGGLE, { id });
    const todo = todos.find((todo) => todo.id === id);
    if (!todo) return;
    todo.completed = !todo.completed;
    await fetch(`/api/todos/${id}`, {
      method: 'PATCH',
      body: JSON.stringify(todo),
    });
    logger.event(LogEvent.TODO_TOGGLE, { id });
    if (onChange) {
      onChange(todo.id);
    }
  };

  const deleteTodo = async (id: number) => {
    logger.event(LogEvent.TODO_DELETE, { id });
    await fetch(`/api/todos/${id}`, {
      method: 'DELETE',
    });
    logger.event(LogEvent.TODO_DELETE, { id });
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
