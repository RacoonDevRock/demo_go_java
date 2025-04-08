package com.eficientis.project.tenant.domain.repository;

import com.eficientis.project.tenant.domain.model.Tenant;
import com.eficientis.project.tenant.domain.model.TenantId;

import java.util.Optional;

public interface TenantRepository {
    Optional<Tenant> findById(TenantId id);
    Optional<Tenant> findBySubdomain(String domain);
    void save(Tenant tenant);
}
