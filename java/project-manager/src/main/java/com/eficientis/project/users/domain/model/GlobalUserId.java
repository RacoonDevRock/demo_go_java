package com.eficientis.project.users.domain.model;

import java.util.Objects;
import java.util.UUID;

public record GlobalUserId(UUID value) {
    public GlobalUserId {
        Objects.requireNonNull(value);
    }
}
