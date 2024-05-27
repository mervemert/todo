package com.hepsiemlak.todo.controller;

import com.hepsiemlak.todo.model.document.Todo;
import com.hepsiemlak.todo.model.response.TodoResponse;
import com.hepsiemlak.todo.service.TodoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
@Tag(name = "Todo", description = "Todo Services")
public class TodoController {

    private final TodoService todoService;

    @PostMapping("/create")
    @Operation(summary = "It creates a new todo")
    public ResponseEntity<TodoResponse> createTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(todoService.createTodo(todo));
    }
}

