package com.hepsiemlak.todo.repository;

import com.hepsiemlak.todo.model.document.User;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface UserRepository extends CouchbaseRepository<User, String> {
    User findByUsername(String username);
}

