package com.eficientis.project.tasks.application.event;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class TaskCreatedEvent {
    private final UUID projectId;
    private final UUID taskId;
    private final String title;
}
