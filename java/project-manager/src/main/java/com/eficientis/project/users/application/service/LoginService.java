package com.eficientis.project.users.application.service;

import com.eficientis.project.users.application.dto.AuthRequestDTO;
import com.eficientis.project.users.application.dto.UserDTO;
import com.eficientis.project.users.application.exception.UsernameNotFoundException;
import com.eficientis.project.users.application.ports.in.LoginUseCase;
import com.eficientis.project.users.domain.model.User;
import com.eficientis.project.users.domain.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService implements LoginUseCase {
    private final UserRepository userRepository;

    @Override
    public UserDTO login(AuthRequestDTO authRequestDTO) {
        User user = userRepository.findByEmail(authRequestDTO.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("User not founded"));

        return new UserDTO(user.getEmail(), user.getDisplayName());
    }
}
