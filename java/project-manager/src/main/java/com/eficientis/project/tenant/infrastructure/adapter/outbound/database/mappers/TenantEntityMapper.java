package com.eficientis.project.tenant.infrastructure.adapter.outbound.database.mappers;

import com.eficientis.project.tenant.domain.model.Tenant;
import com.eficientis.project.tenant.domain.model.TenantId;
import com.eficientis.project.tenant.infrastructure.adapter.outbound.database.TenantEntity;

public class TenantEntityMapper {

    public static TenantEntity toEntity(Tenant tenant) {
        return new TenantEntity(
                tenant.getId().value(),
                tenant.getName(),
                tenant.getSubdomain(),
                tenant.getSubscriptionStatus(),
                tenant.getTrialEndDate(),
                tenant.getCreatedDate()
        );
    }

    public static Tenant toDomain(TenantEntity entity) {
        return new Tenant(
                new TenantId(entity.getId()),
                entity.getName(),
                entity.getSubdomain(),
                entity.getSubscriptionStatus(),
                entity.getTrialEndDate(),
                entity.getCreatedDate()
        );
    }
}
