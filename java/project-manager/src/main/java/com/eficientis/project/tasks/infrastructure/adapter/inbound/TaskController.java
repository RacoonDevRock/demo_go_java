package com.eficientis.project.tasks.infrastructure.adapter.inbound;

import com.eficientis.project.tasks.application.dto.TaskDTO;
import com.eficientis.project.tasks.application.ports.in.CreateTaskUseCase;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;

    @PostMapping
    public void saveTask(@Valid @RequestBody TaskDTO taskDTO) {
        createTaskUseCase.execute(taskDTO);
    };
}
