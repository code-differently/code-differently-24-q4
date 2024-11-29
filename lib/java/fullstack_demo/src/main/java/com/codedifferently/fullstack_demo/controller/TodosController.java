package com.codedifferently.fullstack_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codedifferently.fullstack_demo.model.Todo;
import com.codedifferently.fullstack_demo.repository.TodosRepository;
import com.codedifferently.fullstack_demo.service.ClerkService;

@RestController
@CrossOrigin
@RequestMapping("/api/todos")
public class TodosController {

    @Autowired
    private TodosRepository todosRepository;
    @Autowired
    private ClerkService clerkService;

    @GetMapping()
    public ResponseEntity<Todo[]> getAll(@RequestHeader("Authorization") String authHeader) {
        String userId = this.getUserIdFromRequest(authHeader);
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.ok(this.todosRepository.getAll(userId));
    }

    private String getUserIdFromRequest(String authHeader) {
        var token = authHeader.split(" ")[1];
        var userId = clerkService.getUserId(token);
        return userId;
    }
}
