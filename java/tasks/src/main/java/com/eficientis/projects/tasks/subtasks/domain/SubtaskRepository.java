package com.eficientis.projects.tasks.subtasks.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SubtaskRepository {
    Subtask save(Subtask subtask);
    List<Subtask> findAll();
    Optional<Subtask> findById(UUID id);
    void deleteById(UUID id);
    Subtask updateCompletion(UUID id, boolean completed);
}
