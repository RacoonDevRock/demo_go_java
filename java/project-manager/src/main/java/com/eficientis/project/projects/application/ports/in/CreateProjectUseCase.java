package com.eficientis.project.projects.application.ports.in;

import com.eficientis.project.projects.application.dto.ProjectDTO;
import com.eficientis.project.projects.domain.model.Project;

public interface CreateProjectUseCase {
    void execute(ProjectDTO projectDTO);
}
