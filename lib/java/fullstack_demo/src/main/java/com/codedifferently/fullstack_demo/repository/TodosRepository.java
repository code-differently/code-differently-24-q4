package com.codedifferently.fullstack_demo.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.codedifferently.fullstack_demo.model.Todo;
import com.google.gson.Gson;

import redis.clients.jedis.Jedis;

@Service
public class TodosRepository {

    private Jedis jedis;

    public TodosRepository(
            @Value("${app.redis.host}") String host,
            @Value("${app.redis.port}") int port,
            @Value("${app.redis.password}") String password
    ) {
        this.jedis = new Jedis(host, port, true);
        this.jedis.auth(password);
    }

    public Todo[] getAll(String userId) {
        String json = this.jedis.get("todos:" + userId);
        return new Gson().fromJson(json, Todo[].class);
    }
}
