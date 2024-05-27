package com.hepsiemlak.todo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hepsiemlak.todo.model.document.Todo;
import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.TodoResponse;
import com.hepsiemlak.todo.model.response.UserResponse;
import com.hepsiemlak.todo.service.TodoService;
import com.hepsiemlak.todo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = TodoController.class)
class TodoControllerTest {

    private static final String BASE_URL = "/api/todo";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private TodoService todoService;

    @Test
    void createTodo() throws Exception {
        Todo request = new Todo();
        TodoResponse todoResponse = new TodoResponse();
        Mockito.when(todoService.createTodo(Mockito.any())).thenReturn(todoResponse);

        mockMvc.perform(MockMvcRequestBuilders
                        .post(BASE_URL + "/create")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsBytes(request)))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        Mockito.verify(todoService, Mockito.times(1))
                .createTodo(Mockito.any(Todo.class));
    }
}