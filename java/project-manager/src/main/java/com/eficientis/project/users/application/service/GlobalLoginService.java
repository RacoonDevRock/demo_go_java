package com.eficientis.project.users.application.service;

import com.eficientis.project.users.application.dto.AuthRequestDTO;
import com.eficientis.project.users.application.exception.UsernameNotFoundException;
import com.eficientis.project.users.application.ports.in.GlobalLoginUseCase;
import com.eficientis.project.users.domain.model.GlobalUser;
import com.eficientis.project.users.domain.repository.GlobalUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class GlobalLoginService implements GlobalLoginUseCase {
    private final GlobalUserRepository globalUserRepository;

    @Override
    public GlobalUser globalLogin(AuthRequestDTO authRequestDTO) {
        var user = globalUserRepository.findByEmail(authRequestDTO.getEmail())
                .orElseThrow(() -> new UsernameNotFoundException("Email no encontrado"));

        // Aquí deberías usar PasswordEncoder si lo tienes configurado
        if (!user.getHashedPassword().equals(authRequestDTO.getPassword())) {
            throw new RuntimeException("Contraseña incorrecta");
        }

        return new GlobalUser(
                user.getId(),
                user.getEmail(),
                user.getHashedPassword(),
                user.getDisplayName(),
                user.isSystemAdmin()
        );
    }
}
