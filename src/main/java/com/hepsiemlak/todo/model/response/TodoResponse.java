package com.hepsiemlak.todo.model.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TodoResponse {
    private String description;
    private Boolean isDone;
    private LocalDate targetDate;
}
