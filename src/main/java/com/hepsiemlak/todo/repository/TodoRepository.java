package com.hepsiemlak.todo.repository;

import com.hepsiemlak.todo.model.document.Todo;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

import java.util.List;

public interface TodoRepository extends CouchbaseRepository<Todo, String> {
    List<Todo> findByUserId(String userId);
}

