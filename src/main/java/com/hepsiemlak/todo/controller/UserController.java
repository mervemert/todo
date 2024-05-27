package com.hepsiemlak.todo.controller;

import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.UserResponse;
import com.hepsiemlak.todo.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
@Tag(name = "User", description = "User Services")
public class UserController {

    private final UserService userService;

    @PostMapping("/create")
    @Operation(summary = "It creates a new user")
    public ResponseEntity<UserResponse> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }
}

