package com.eficientis.project.projects.application.service;

import com.eficientis.project.projects.application.dto.ProjectDTO;
import com.eficientis.project.projects.application.dto.mapper.ProjectDtoMapper;
import com.eficientis.project.projects.application.ports.in.FindAllProjectsUseCase;
import com.eficientis.project.projects.domain.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindAllProjectsService implements FindAllProjectsUseCase {
    private final ProjectRepository projectRepository;

    @Override
    public List<ProjectDTO> execute() {
        return projectRepository.findAll()
                .stream()
                .map(ProjectDtoMapper::toDto)
                .toList();
    }
}
