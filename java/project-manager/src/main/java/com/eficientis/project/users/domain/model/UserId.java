package com.eficientis.project.users.domain.model;

import java.util.Objects;
import java.util.UUID;

public record UserId(UUID value) {
    public UserId {
        Objects.requireNonNull(value);
    }
}
