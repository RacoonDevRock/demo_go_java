package com.eficientis.project.users.infrastructure.adapter.outbound.database;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface IGlobalUserRepository extends JpaRepository<GlobalUserEntity, UUID> {
    Optional<GlobalUserEntity> findByEmail(String email);
}
