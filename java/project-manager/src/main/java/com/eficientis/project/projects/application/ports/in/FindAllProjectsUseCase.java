package com.eficientis.project.projects.application.ports.in;

import com.eficientis.project.projects.application.dto.ProjectDTO;

import java.util.List;

public interface FindAllProjectsUseCase {
    List<ProjectDTO> execute();
}
