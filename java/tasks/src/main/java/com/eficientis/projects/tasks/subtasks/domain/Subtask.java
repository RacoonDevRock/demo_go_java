package com.eficientis.projects.tasks.subtasks.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subtask {
    private UUID id;
    private String title;
    private boolean completed;
}
