package com.eficientis.project.tenant.infrastructure.adapter.inbound;

import com.eficientis.project.tenant.application.dto.TenantDTO;
import com.eficientis.project.tenant.application.ports.in.RegisterTenantUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/tenants")
@RequiredArgsConstructor
public class TenantController {

    private final RegisterTenantUseCase registerTenantUseCase;

    @PostMapping("/register")
    public ResponseEntity<TenantDTO> register(@Valid @RequestBody Map<String, String> body) {
        String name = body.get("name");
        String subdomain = body.get("subdomain");

        TenantDTO createdTenant = registerTenantUseCase.registerTenant(name, subdomain);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTenant);
    }
}
