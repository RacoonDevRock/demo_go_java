package com.eficientis.project.projects.domain.model;

import java.util.Objects;
import java.util.UUID;

public record ProjectId(UUID value) {
    public ProjectId {
        Objects.requireNonNull(value);
    }
}
