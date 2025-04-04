package com.eficientis.projects.tasks.notifications.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
public class Notification {
    private final UUID id;
    private final String message;
}
