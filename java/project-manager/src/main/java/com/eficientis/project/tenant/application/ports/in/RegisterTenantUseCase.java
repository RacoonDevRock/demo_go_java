package com.eficientis.project.tenant.application.ports.in;

import com.eficientis.project.tenant.application.dto.TenantDTO;

public interface RegisterTenantUseCase {
    TenantDTO registerTenant(String name, String subdomain);
}
