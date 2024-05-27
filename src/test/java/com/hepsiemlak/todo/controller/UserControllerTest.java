package com.hepsiemlak.todo.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.UserResponse;
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

@ExtendWith(MockitoExtension.class)
@WebMvcTest(controllers = UserController.class)
class UserControllerTest {

    private static final String BASE_URL = "/api/user";

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private UserService userService;

    @Test
    void createUser() throws Exception {
        User request = new User();
        UserResponse userResponse = new UserResponse();
        Mockito.when(userService.createUser(Mockito.any())).thenReturn(userResponse);

        mockMvc.perform(MockMvcRequestBuilders
                .post(BASE_URL + "/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsBytes(request)))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();

        Mockito.verify(userService, Mockito.times(1))
                .createUser(Mockito.any(User.class));
    }
}