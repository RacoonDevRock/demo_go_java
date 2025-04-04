package com.eficientis.projects.tasks.subtasks.infrastructure;

import com.eficientis.projects.tasks.subtasks.application.CreateSubtaskUseCase;
import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subtasks")
@RequiredArgsConstructor
public class SubtaskController {
    private final CreateSubtaskUseCase createSubtaskUseCase;

    @PostMapping
    public Subtask create(@RequestBody CreateSubtaskRequest request) {
        return  createSubtaskUseCase.execute(request.getTitle());
    }

    @Setter
    @Getter
    static class CreateSubtaskRequest {
        private String title;
    }

}
