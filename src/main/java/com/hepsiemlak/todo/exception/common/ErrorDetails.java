package com.hepsiemlak.todo.exception.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
    private LocalDate timestamp;
    private String message;
    private String details;
}
