package com.hepsiemlak.todo.service.impl;

import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.UserResponse;
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
class UserServiceImplTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @Mock
    private ModelMapper modelMapper;

    @Test
    void createUser() {
        User user = new User();

        Mockito.when(userRepository.save(Mockito.any())).thenReturn(new User());

        UserResponse result = userService.createUser(user);

        Assertions.assertNull(result);
    }
}