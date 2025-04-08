package com.eficientis.project.users.infrastructure.adapter.inbound;

import com.eficientis.project.infrastructure.security.JwtTokenProvider;
import com.eficientis.project.users.application.dto.AuthRequestDTO;
import com.eficientis.project.users.application.ports.in.GlobalLoginUseCase;
import com.eficientis.project.users.domain.model.GlobalUser;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/global")
@RequiredArgsConstructor
public class GlobalAuthController {
    private final GlobalLoginUseCase loginUseCase;
    private final JwtTokenProvider tokenProvider;

    @PostMapping("/login")
    public ResponseEntity<String> login(@Valid @RequestBody AuthRequestDTO request) {
        GlobalUser user = loginUseCase.globalLogin(request); // autentica
        String token = tokenProvider.generateToken(user);

        return ResponseEntity.ok(token);
    }
}
