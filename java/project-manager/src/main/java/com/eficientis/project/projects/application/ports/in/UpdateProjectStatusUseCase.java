package com.eficientis.project.projects.application.ports.in;

import com.eficientis.project.projects.application.dto.ProjectDTO;

import java.util.UUID;

public interface UpdateProjectStatusUseCase {
    void execute(UUID projectId, String newStatus);
}
