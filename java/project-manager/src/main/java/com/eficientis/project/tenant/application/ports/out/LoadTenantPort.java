package com.eficientis.project.tenant.application.ports.out;

import com.eficientis.project.tenant.domain.model.Tenant;
import com.eficientis.project.tenant.domain.model.TenantId;

import java.util.Optional;

public interface LoadTenantPort {
    Optional<Tenant> loadById(TenantId id);
    Optional<Tenant> loadBySubdomain(String subdomain);
}
