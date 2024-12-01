package com.codedifferently.fullstack_demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.codedifferently.fullstack_demo.model.Todo;

@Service
public class InMemoryTodosRepository implements TodosRepository {

    private final Map<String, List<Todo>> todosStorage = new HashMap<>();

    @Override
    public List<Todo> getAll(String userId) {
        return todosStorage.getOrDefault(userId, new ArrayList<>());
    }

    @Override
    public long create(String userId, Todo todo) {
        List<Todo> userTodos = todosStorage.computeIfAbsent(userId, k -> new ArrayList<>());
        long newId = System.currentTimeMillis();
        todo.setId(newId);
        userTodos.add(todo);
        return newId;
    }

    @Override
    public void patch(String userId, Todo todo) {
        List<Todo> userTodos = todosStorage.get(userId);
        if (userTodos != null) {
            for (int i = 0; i < userTodos.size(); i++) {
                if (userTodos.get(i).getId() == todo.getId()) {
                    userTodos.set(i, todo);
                    break;
                }
            }
        }
    }

    @Override
    public void delete(String userId, long id) {
        List<Todo> userTodos = todosStorage.get(userId);
        if (userTodos != null) {
            userTodos.removeIf(todo -> todo.getId() == id);
        }
    }
}
