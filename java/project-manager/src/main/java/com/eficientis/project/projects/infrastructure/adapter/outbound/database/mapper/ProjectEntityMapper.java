package com.eficientis.project.projects.infrastructure.adapter.outbound.database.mapper;

import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;
import com.eficientis.project.projects.domain.model.enums.ProjectStatus;
import com.eficientis.project.projects.infrastructure.adapter.outbound.database.ProjectEntity;

public class ProjectEntityMapper {

    public static ProjectEntity toEntity(Project domain) {
        return new ProjectEntity(
                domain.getId().value(),
                domain.getName(),
                domain.getDescription(),
                domain.getStartDate(),
                domain.getEndDate(),
                domain.getStatus(),
                domain.getCreatedAt(),
                domain.getUpdatedAt()
        );
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
