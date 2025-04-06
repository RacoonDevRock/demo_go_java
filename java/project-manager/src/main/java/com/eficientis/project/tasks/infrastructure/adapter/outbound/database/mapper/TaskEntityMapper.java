package com.eficientis.project.tasks.infrastructure.adapter.outbound.database.mapper;

import com.eficientis.project.tasks.application.dto.TaskDTO;
import com.eficientis.project.tasks.domain.model.Task;
import com.eficientis.project.tasks.infrastructure.adapter.outbound.database.TaskEntity;

public class TaskEntityMapper {

    // retorna entity
    public static TaskEntity toEntity(Task task) {
        TaskEntity entity = new TaskEntity();
        entity.setId(task.getId());
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
        entity.setStatus(task.getStatus());
        entity.setCreationDate(task.getCreationDate());
        entity.setClosingDate(task.getClosingDate());
        entity.setProjectId(task.getProjectId());
        return entity;
    }

    // retorna model
    public static Task toDomain(TaskEntity entity) {
        return new Task(
                entity.getId(),
                entity.getTitle(),
                entity.getDescription(),
                entity.getCreationDate(),
                entity.getClosingDate(),
                entity.getStatus(),
                entity.getProjectId()
        );
    }

    public static TaskDTO toDto(Task task) {
        return new TaskDTO(
                task.getTitle(),
                task.getDescription(),
                task.getStatus(),
                task.getClosingDate(),
                task.getProjectId()
        );
    }
}
