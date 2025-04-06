package com.eficientis.project.projects.application.dto.mapper;

import com.eficientis.project.projects.application.dto.ProjectDTO;
import com.eficientis.project.projects.domain.model.Project;

public class ProjectDtoMapper {
    public static ProjectDTO toDto(Project project) {
        ProjectDTO dto = new ProjectDTO();
        dto.name = project.getName();
        dto.description = project.getDescription();
        dto.startDate = project.getStartDate();
        dto.endDate = project.getEndDate();
        return dto;
    }
}
