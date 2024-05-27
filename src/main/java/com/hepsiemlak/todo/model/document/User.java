package com.hepsiemlak.todo.model.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String mobile;
    private String email;
}

