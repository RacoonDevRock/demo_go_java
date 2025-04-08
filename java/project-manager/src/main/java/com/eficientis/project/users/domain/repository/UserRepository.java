package com.eficientis.project.users.domain.repository;

import com.eficientis.project.users.domain.model.User;
import com.eficientis.project.users.domain.model.UserId;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(UserId id);
    Optional<User> findByEmail(String email);
    List<User> findAll();
    User save(User user);
    void deleteById(UserId id);
}
