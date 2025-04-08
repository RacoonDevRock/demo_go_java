package com.eficientis.project.users.domain.repository;

import com.eficientis.project.users.domain.model.GlobalUser;

import java.util.Optional;

public interface GlobalUserRepository {
    Optional<GlobalUser> findByEmail(String email);
}
