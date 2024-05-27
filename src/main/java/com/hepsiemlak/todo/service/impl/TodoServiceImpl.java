package com.hepsiemlak.todo.service.impl;

import com.hepsiemlak.todo.model.document.Todo;
import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.TodoResponse;
import com.hepsiemlak.todo.model.response.UserResponse;
import com.hepsiemlak.todo.repository.TodoRepository;
import com.hepsiemlak.todo.repository.UserRepository;
import com.hepsiemlak.todo.service.TodoService;
import com.hepsiemlak.todo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository todoRepository;
    private final ModelMapper modelMapper;

    @Override
    public TodoResponse createTodo(Todo todo) {
        Todo savedTodo = todoRepository.save(todo);
        return modelMapper.map(savedTodo, TodoResponse.class);
    }
}
