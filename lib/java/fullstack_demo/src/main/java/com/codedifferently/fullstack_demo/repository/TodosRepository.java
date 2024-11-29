package com.codedifferently.fullstack_demo.repository;

import org.springframework.stereotype.Service;

import com.codedifferently.fullstack_demo.model.Todo;
import com.google.gson.Gson;

import redis.clients.jedis.Jedis;

@Service
public class TodosRepository {

    private Jedis jedis;

    public TodosRepository() {
        this.jedis = new Jedis("adapted-akita-43692.upstash.io", 6379, true);
        this.jedis.auth("AaqsAAIjcDEwOWI0NjM1YWNlOTQ0YmZmOTAwYTczOTcxMmNiMWM2Y3AxMA");
    }

    public Todo[] getAll(String userId) {
        String json = this.jedis.get("todos:" + userId);
        return new Gson().fromJson(json, Todo[].class);
    }
}
