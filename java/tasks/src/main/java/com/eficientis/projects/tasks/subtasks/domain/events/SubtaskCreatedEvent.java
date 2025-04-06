package com.eficientis.projects.tasks.subtasks.domain.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class SubtaskCreatedEvent {
    private final UUID subtaskId;
}
