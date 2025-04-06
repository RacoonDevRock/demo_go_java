package com.eficientis.project.projects.infrastructure.adapter.outbound.database.mapper;

import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;
import com.eficientis.project.projects.domain.model.ProjectStatus;
import com.eficientis.project.projects.infrastructure.adapter.outbound.database.ProjectEntity;

public class ProjectEntityMapper {

    public static ProjectEntity toEntity(Project domain) {
        ProjectEntity entity = new ProjectEntity();
        entity.setId(domain.getId().value());
        entity.setName(domain.getName());
        entity.setDescription(domain.getDescription());
        entity.setStartDate(domain.getStartDate());
        entity.setEndDate(domain.getEndDate());
        entity.setStatus(domain.getStatus());
        entity.setCreatedAt(domain.getCreatedAt());
        entity.setUpdatedAt(domain.getUpdatedAt());
        return entity;
    }

    public static Project toDomain(ProjectEntity entity) {
        return new Project(
                new ProjectId(entity.getId()),
                entity.getName(),
                entity.getDescription(),
                entity.getStartDate(),
                entity.getEndDate(),
                ProjectStatus.valueOf(entity.getStatus().name()),
                entity.getCreatedAt(),
                entity.getUpdatedAt()
        );
    }

    public static void updateEntity(ProjectEntity entity, Project project) {
        entity.setStatus(project.getStatus());
        entity.setUpdatedAt(project.getUpdatedAt());
    }
}
