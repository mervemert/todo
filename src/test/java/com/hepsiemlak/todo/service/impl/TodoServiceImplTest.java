package com.hepsiemlak.todo.service.impl;

import com.hepsiemlak.todo.model.document.Todo;
import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.TodoResponse;
import com.hepsiemlak.todo.model.response.UserResponse;
import com.hepsiemlak.todo.repository.TodoRepository;
import com.hepsiemlak.todo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TodoServiceImplTest {

    @InjectMocks
    private TodoServiceImpl todoService;

    @Mock
    private TodoRepository todoRepository;

    @Mock
    private ModelMapper modelMapper;

    @Test
    void createTodo() {
        Todo todo = new Todo();

        Mockito.when(todoRepository.save(Mockito.any())).thenReturn(new Todo());

        TodoResponse result = todoService.createTodo(todo);

        Assertions.assertNull(result);
    }
}