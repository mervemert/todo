package com.hepsiemlak.todo.model.response;

import lombok.*;

@Getter
@Setter
public class UserResponse {
    private String username;
    private String password;
    private String mobile;
    private String email;
}
