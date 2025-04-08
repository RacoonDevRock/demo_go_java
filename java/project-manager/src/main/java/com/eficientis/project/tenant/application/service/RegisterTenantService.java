package com.eficientis.project.tenant.application.service;

import com.eficientis.project.infrastructure.tenant.database.TenantSchemaCreator;
import com.eficientis.project.tenant.application.dto.TenantDTO;
import com.eficientis.project.tenant.application.ports.in.RegisterTenantUseCase;
import com.eficientis.project.tenant.domain.model.Tenant;
import com.eficientis.project.tenant.domain.model.TenantId;
import com.eficientis.project.tenant.domain.model.enums.SubscriptionStatus;
import com.eficientis.project.tenant.domain.repository.TenantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RegisterTenantService implements RegisterTenantUseCase {
    private final TenantRepository tenantRepository;
    private final TenantSchemaCreator tenantSchemaCreator;

    @Override
    public TenantDTO registerTenant(String name, String subdomain) {
        Tenant tenant = new Tenant(
                new TenantId(UUID.randomUUID()),
                name,
                subdomain,
                SubscriptionStatus.TRIAL,
                LocalDate.now().plusDays(15),
                LocalDateTime.now()
        );

        tenantRepository.save(tenant);
        tenantSchemaCreator.createSchema(subdomain);

        return new TenantDTO(
                tenant.getName(),
                tenant.getSubdomain(),
                tenant.getSubscriptionStatus().toString(),
                tenant.getTrialEndDate(),
                tenant.getCreatedDate()
        );
    }
}
