package com.eficientis.project.users.infrastructure.adapter.outbound.database.impl;

import com.eficientis.project.users.domain.model.GlobalUser;
import com.eficientis.project.users.domain.repository.GlobalUserRepository;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.GlobalUserEntity;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.IGlobalUserRepository;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.exception.UsernameNotFoundException;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.mappers.GlobalUserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class GlobalUserRepositoryImpl implements GlobalUserRepository {

    private final IGlobalUserRepository userRepository;

    @Override
    public Optional<GlobalUser> findByEmail(String email) {
        GlobalUserEntity entity = userRepository
                .findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Global user not founded"));

        return Optional.of(GlobalUserEntityMapper.toDomain(entity));
    }
}
