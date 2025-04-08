package com.eficientis.project.tenant.infrastructure.adapter.outbound.database.impl;

import com.eficientis.project.tenant.domain.model.Tenant;
import com.eficientis.project.tenant.domain.model.TenantId;
import com.eficientis.project.tenant.domain.repository.TenantRepository;
import com.eficientis.project.tenant.infrastructure.adapter.outbound.database.JpaTenantRepository;
import com.eficientis.project.tenant.infrastructure.adapter.outbound.database.mappers.TenantEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TenantRepositoryImpl implements TenantRepository {
    private final JpaTenantRepository repository;

    @Override
    public Optional<Tenant> findById(TenantId id) {
        return repository.findById(id.value())
                .map(TenantEntityMapper::toDomain);
    }

    @Override
    public Optional<Tenant> findBySubdomain(String domain) {
        return repository.findBySubdomain(domain)
                .map(TenantEntityMapper::toDomain);
    }

    @Override
    public void save(Tenant tenant) {
        repository.save(TenantEntityMapper.toEntity(tenant));
    }
}
