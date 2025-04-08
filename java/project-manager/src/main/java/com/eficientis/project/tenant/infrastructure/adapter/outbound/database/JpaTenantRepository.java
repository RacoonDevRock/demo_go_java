package com.eficientis.project.tenant.infrastructure.adapter.outbound.database;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JpaTenantRepository extends JpaRepository<TenantEntity, UUID> {
    Optional<TenantEntity> findBySubdomain(String subdomain);
}
