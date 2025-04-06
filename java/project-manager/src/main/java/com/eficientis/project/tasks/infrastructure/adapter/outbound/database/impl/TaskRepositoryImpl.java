package com.eficientis.project.tasks.infrastructure.adapter.outbound.database.impl;

import com.eficientis.project.tasks.domain.model.Task;
import com.eficientis.project.tasks.domain.repository.TaskRepository;
import com.eficientis.project.tasks.infrastructure.adapter.outbound.database.ITaskRepository;
import com.eficientis.project.tasks.infrastructure.adapter.outbound.database.TaskEntity;
import com.eficientis.project.tasks.infrastructure.adapter.outbound.database.mapper.TaskEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class TaskRepositoryImpl implements TaskRepository {
    private final ITaskRepository repository;

    @Override
    public Optional<Task> findById(UUID id) {
        TaskEntity taskEntity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not founded task"));

        Task task = TaskEntityMapper.toDomain(taskEntity);

        return Optional.of(task);
    }

    @Override
    public List<Task> findAll() {
        return repository.findAll()
                .stream()
                .map(TaskEntityMapper::toDomain)
                .toList();
    }

    @Override
    public void save(Task task) {
        TaskEntity taskEntity = TaskEntityMapper.toEntity(task);
        repository.save(taskEntity);
    }

    @Override
    public void deleteById(UUID id) {
        repository.deleteById(id);
    }
}
