package com.eficientis.project.users.infrastructure.adapter.inbound;

import com.eficientis.project.users.application.dto.AuthRequestDTO;
import com.eficientis.project.users.application.dto.RegisterRequestDTO;
import com.eficientis.project.users.application.dto.UserDTO;
import com.eficientis.project.users.application.ports.in.LoginUseCase;
import com.eficientis.project.users.application.ports.in.RegisterUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final RegisterUseCase registerUseCase;
    private final LoginUseCase loginUseCase;

    @PostMapping("/register")
    public ResponseEntity<UserDTO> login(@Valid @RequestBody RegisterRequestDTO requestDTO) {
        return ResponseEntity.ok(registerUseCase.register(requestDTO));
    }

    @PostMapping("/login")
    public ResponseEntity<UserDTO> login(@Valid @RequestBody AuthRequestDTO authRequestDTO) {
        return ResponseEntity.ok(loginUseCase.login(authRequestDTO));
    }
}
