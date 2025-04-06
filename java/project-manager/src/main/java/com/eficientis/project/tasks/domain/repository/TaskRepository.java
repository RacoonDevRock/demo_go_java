package com.eficientis.project.tasks.domain.repository;

import com.eficientis.project.tasks.domain.model.Task;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskRepository {
    Optional<Task> findById(UUID id);
    List<Task> findAll();
    void save(Task task);
    void deleteById(UUID id);
}
