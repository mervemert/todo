package com.hepsiemlak.todo.service;

import com.hepsiemlak.todo.model.document.Todo;
import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.TodoResponse;
import com.hepsiemlak.todo.model.response.UserResponse;

public interface TodoService {
    TodoResponse createTodo(Todo todo);
}
