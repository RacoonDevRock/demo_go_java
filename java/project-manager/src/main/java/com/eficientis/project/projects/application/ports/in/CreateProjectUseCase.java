package com.eficientis.project.projects.application.ports.in;

import com.eficientis.project.projects.application.dto.ProjectDTO;

public interface CreateProjectUseCase {
    void execute(ProjectDTO projectDTO);
}
