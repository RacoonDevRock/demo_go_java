package com.eficientis.project.users.application.service;

import com.eficientis.project.users.application.dto.RegisterRequestDTO;
import com.eficientis.project.users.application.dto.UserDTO;
import com.eficientis.project.users.application.ports.in.RegisterUseCase;
import com.eficientis.project.users.domain.model.User;
import com.eficientis.project.users.domain.model.UserId;
import com.eficientis.project.users.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RegisterUserService implements RegisterUseCase {
    private final UserRepository userRepository;

    @Override
    public UserDTO register(RegisterRequestDTO registerRequestDTO) {
        User user = new User(
                new UserId(UUID.randomUUID()),
                registerRequestDTO.getEmail(),
                registerRequestDTO.getPassword(),
                registerRequestDTO.getEmail() + "_",
                false
        );

        userRepository.save(user);

        return new UserDTO(user.getEmail(), user.getDisplayName());
    }
}
