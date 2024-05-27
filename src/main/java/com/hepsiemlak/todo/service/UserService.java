package com.hepsiemlak.todo.service;

import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.UserResponse;

public interface UserService {
    UserResponse createUser(User user);
}
