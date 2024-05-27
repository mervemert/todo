package com.hepsiemlak.todo.model.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

import java.time.LocalDate;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Todo {
    @Id
    private String id;
    private String userId;
    private String description;
    private Boolean isDone;
    private LocalDate targetDate;
}

