package com.eficientis.project.projects.infrastructure.adapter.inbound;

import com.eficientis.project.projects.application.dto.ProjectDTO;
import com.eficientis.project.projects.application.ports.in.CreateProjectUseCase;
import com.eficientis.project.projects.application.ports.in.FindAllProjectsUseCase;
import com.eficientis.project.projects.application.ports.in.UpdateProjectStatusUseCase;
import com.eficientis.project.projects.domain.model.Project;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final CreateProjectUseCase createProject;
    private final UpdateProjectStatusUseCase updateStatus;
    private final FindAllProjectsUseCase findAllProjects;

    @GetMapping
    public ResponseEntity<List<ProjectDTO>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(findAllProjects.execute());
    }

    @PostMapping
    public ResponseEntity<Project> create(@Valid @RequestBody ProjectDTO dto) {
        createProject.execute(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PatchMapping("/{id}/status")
    public ResponseEntity<Void> updatedStatus(@PathVariable UUID id, @RequestParam String status) {
        updateStatus.execute(id, status);
        return ResponseEntity.noContent().build();
    }
}
