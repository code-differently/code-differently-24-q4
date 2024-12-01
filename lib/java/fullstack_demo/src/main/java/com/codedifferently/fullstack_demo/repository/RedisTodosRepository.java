package com.codedifferently.fullstack_demo.repository;

import java.util.ArrayList;
import java.util.List;

import com.codedifferently.fullstack_demo.model.Todo;
import com.google.gson.Gson;

import redis.clients.jedis.Jedis;

public class RedisTodosRepository implements TodosRepository {

    private final Jedis jedis;

    public RedisTodosRepository(
            String host,
            int port,
            String password
    ) {

        this.jedis = new Jedis(host, port, true);
        this.jedis.auth(password);
    }

    @Override
    public List<Todo> getAll(String userId) {
        String json = this.jedis.get("todos:" + userId);
        return List.of(new Gson().fromJson(json, Todo[].class));
    }

    @Override
    public long create(String userId, Todo todo) {
        List<Todo> todos = new ArrayList(this.getAll(userId));

        todo.setId(System.currentTimeMillis());
        todos.add(todo);

        this.jedis.set("todos:" + userId, new Gson().toJson(todos));
        return todo.getId();
    }

    @Override
    public void patch(String userId, Todo todo) {
        List<Todo> todos = new ArrayList(this.getAll(userId));

        List<Todo> updatedTodos = todos.stream()
                .map(t -> t.getId() == todo.getId() ? todo : t)
                .toList();

        this.jedis.set("todos:" + userId, new Gson().toJson(updatedTodos));
    }

    @Override
    public void delete(String userId, long id) {
        List<Todo> todos = this.getAll(userId);

        List<Todo> updatedTodos = todos.stream()
                .filter(t -> t.getId() != id)
                .toList();

        this.jedis.set("todos:" + userId, new Gson().toJson(updatedTodos));
    }
}
