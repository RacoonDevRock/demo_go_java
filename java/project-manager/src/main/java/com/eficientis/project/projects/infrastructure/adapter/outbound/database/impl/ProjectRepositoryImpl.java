package com.eficientis.project.projects.infrastructure.adapter.outbound.database.impl;

import com.eficientis.project.projects.domain.model.Project;
import com.eficientis.project.projects.domain.model.ProjectId;
import com.eficientis.project.projects.domain.repository.ProjectRepository;
import com.eficientis.project.projects.infrastructure.adapter.outbound.database.IProjectRepository;
import com.eficientis.project.projects.infrastructure.adapter.outbound.database.ProjectEntity;
import com.eficientis.project.projects.infrastructure.adapter.outbound.database.mapper.ProjectEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

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
