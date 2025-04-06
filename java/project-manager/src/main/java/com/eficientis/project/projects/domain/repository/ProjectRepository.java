package com.eficientis.project.projects.domain.repository;

import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;

import java.util.List;
import java.util.Optional;

public interface ProjectRepository {
    Optional<Project> findById(ProjectId id);
    List<Project> findAll();
    Project save(Project project);
    void deleteById(ProjectId id);
}
