package com.hepsiemlak.todo.service.impl;

import com.hepsiemlak.todo.model.document.User;
import com.hepsiemlak.todo.model.response.UserResponse;
import com.hepsiemlak.todo.repository.UserRepository;
import com.hepsiemlak.todo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserResponse createUser(User user) {
        User savedUser = userRepository.save(user);
        return modelMapper.map(savedUser, UserResponse.class);
    }
}
