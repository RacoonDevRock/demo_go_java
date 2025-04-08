package com.eficientis.project.projects.application.service;

import com.eficientis.project.projects.application.exception.NotFoundProjectException;
import com.eficientis.project.projects.application.ports.in.UpdateProjectStatusUseCase;
import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;
import com.eficientis.project.projects.domain.model.enums.ProjectStatus;
import com.eficientis.project.projects.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UpdateProjectStatusService implements UpdateProjectStatusUseCase {
    private final ProjectRepository projectRepository;

    @Override
    public void execute(UUID projectId, String newStatus) {
        Project project = projectRepository.findById(new ProjectId(projectId))
                .orElseThrow(() -> new NotFoundProjectException("Project with ID " + projectId + " not founded"));

        project.updateStatus(ProjectStatus.valueOf(newStatus.toUpperCase()));
        projectRepository.save(project);
    }
}
