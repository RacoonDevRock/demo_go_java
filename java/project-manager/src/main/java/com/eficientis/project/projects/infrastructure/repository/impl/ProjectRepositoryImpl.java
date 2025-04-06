package com.eficientis.project.projects.infrastructure.repository.impl;

import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;
import com.eficientis.project.projects.domain.repository.ProjectRepository;
import com.eficientis.project.projects.infrastructure.persistence.ProjectEntity;
import com.eficientis.project.projects.infrastructure.persistence.mapper.ProjectEntityMapper;
import com.eficientis.project.projects.infrastructure.repository.IProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class ProjectRepositoryImpl implements ProjectRepository {
    private final IProjectRepository repository;

    @Override
    public Optional<Project> findById(ProjectId id) {
        return repository.findById(id.value()).map(ProjectEntityMapper::toDomain);
    }

    @Override
    public List<Project> findAll() {
        return repository.findAll()
                .stream()
                .map(ProjectEntityMapper::toDomain)
                .toList();
    }

    @Override
    public Project save(Project project) {
        ProjectEntity savedEntity = repository.save(ProjectEntityMapper.toEntity(project));
        return ProjectEntityMapper.toDomain(savedEntity);
    }

    @Override
    public void deleteById(ProjectId id) {
        repository.deleteById(id.value());
    }
}
