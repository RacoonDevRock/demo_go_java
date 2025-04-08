package com.eficientis.project.users.infrastructure.adapter.outbound.database.impl;

import com.eficientis.project.users.domain.model.User;
import com.eficientis.project.users.domain.model.UserId;
import com.eficientis.project.users.domain.repository.UserRepository;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.IUserRepository;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.UserEntity;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.mappers.UserEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

    private final IUserRepository userRepository;

    @Override
    public Optional<User> findById(UserId id) {
        UserEntity userEntity = userRepository.findById(id.value())
                .orElseThrow(() -> new RuntimeException("User not founded"));
        return Optional.of(UserEntityMapper.toDomain(userEntity));
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email).map(UserEntityMapper::toDomain);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserEntityMapper::toDomain)
                .toList();
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = userRepository.save(UserEntityMapper.toEntity(user));
        return UserEntityMapper.toDomain(userEntity);
    }

    @Override
    public void deleteById(UserId id) {
        userRepository.deleteById(id.value());
    }
}
