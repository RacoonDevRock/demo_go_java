package com.eficientis.project.tenant.domain.model;

import java.util.Objects;
import java.util.UUID;

public record TenantId(UUID value) {
    public TenantId {
        Objects.requireNonNull(value);
    }
}
