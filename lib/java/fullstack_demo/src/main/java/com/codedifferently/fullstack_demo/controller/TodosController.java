package com.codedifferently.fullstack_demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public ResponseEntity<List<Todo>> getAll(@RequestHeader("Authorization") String authHeader) {
        String userId = this.getUserIdFromRequest(authHeader);
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        return ResponseEntity.ok(this.todosRepository.getAll(userId));
    }

    @PostMapping()
    public ResponseEntity<Long> create(@RequestHeader("Authorization") String authHeader, @RequestBody Todo todo) {
        String userId = this.getUserIdFromRequest(authHeader);
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        long id = this.todosRepository.create(userId, todo);
        return ResponseEntity.ok(id);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Void> patch(@RequestHeader("Authorization") String authHeader, @RequestBody Todo todo) {
        String userId = this.getUserIdFromRequest(authHeader);
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        this.todosRepository.patch(userId, todo);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@RequestHeader("Authorization") String authHeader, @PathVariable("id") Long id) {
        String userId = this.getUserIdFromRequest(authHeader);
        if (userId == null) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
        this.todosRepository.delete(userId, id);
        return ResponseEntity.noContent().build();
    }

    private String getUserIdFromRequest(String authHeader) {
        var token = authHeader.split(" ")[1];
        var userId = clerkService.getUserId(token);
        return userId;
    }
}
