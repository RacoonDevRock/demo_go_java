package com.eficientis.project.projects.application.service;

import com.eficientis.project.projects.application.dto.ProjectDTO;
import com.eficientis.project.projects.application.ports.in.CreateProjectUseCase;
import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;
import com.eficientis.project.projects.domain.model.ProjectStatus;
import com.eficientis.project.projects.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateProjectService implements CreateProjectUseCase {
    private final ProjectRepository projectRepository;

    @Override
    public void execute(ProjectDTO projectDTO) {
        Project project = new Project(
                new ProjectId(UUID.randomUUID()),
                projectDTO.name,
                projectDTO.description,
                projectDTO.startDate,
                projectDTO.endDate,
                ProjectStatus.NOT_STARTED,
                LocalDateTime.now(),
                LocalDateTime.now()
        );

        projectRepository.save(project);
    }
}
