package com.codedifferently.fullstack_demo.repository;

import java.util.List;

import com.codedifferently.fullstack_demo.model.Todo;

public interface TodosRepository {

    List<Todo> getAll(String userId);

    long create(String userId, Todo todo);

    void patch(String userId, Todo todo);

    void delete(String userId, long id);

}
