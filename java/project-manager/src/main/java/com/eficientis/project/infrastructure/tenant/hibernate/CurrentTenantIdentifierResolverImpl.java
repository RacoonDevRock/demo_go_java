package com.eficientis.project.infrastructure.tenant.hibernate;

import com.eficientis.project.infrastructure.tenant.TenantContext;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

@Component
public class CurrentTenantIdentifierResolverImpl implements CurrentTenantIdentifierResolver {
    private static final String DEFAULT_TENANT = "public";

    @Override
    public Object resolveCurrentTenantIdentifier() {
        return TenantContext.getTenantId() != null ? TenantContext.getTenantId() :  DEFAULT_TENANT;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
