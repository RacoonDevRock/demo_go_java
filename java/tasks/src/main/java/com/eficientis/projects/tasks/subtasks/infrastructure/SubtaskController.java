package com.eficientis.projects.tasks.subtasks.infrastructure;

import com.eficientis.projects.tasks.subtasks.application.CreateSubtaskUseCase;
import com.eficientis.projects.tasks.subtasks.application.GetAllSubtaskUseCase;
import com.eficientis.projects.tasks.subtasks.application.UpdateSubtaskCompletionUseCase;
import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import lombok.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/subtasks")
@RequiredArgsConstructor
public class SubtaskController {
    private final CreateSubtaskUseCase createSubtaskUseCase;
    private final GetAllSubtaskUseCase getAllSubtaskUseCase;
    private final UpdateSubtaskCompletionUseCase completionUseCase;

    @GetMapping
    public List<CreateSubtaskResponse> getAll() {
        List<Subtask> subtasks = getAllSubtaskUseCase.execute();

        return subtasks.stream()
//                .limit(2)cor
                .map(subtask -> new CreateSubtaskResponse(
                        subtask.getId(),
                        subtask.getTitle(),
                        subtask.isCompleted()))
                .toList();
    }

    @PostMapping
    public Subtask create(@RequestBody CreateSubtaskRequest request) {
        return createSubtaskUseCase.execute(request.getTitle());
    }

    @PatchMapping("/{id}/complete")
    public Subtask updateSubtaskCompletion(@PathVariable UUID id, @RequestParam boolean completed) {
        System.out.println("Actualizando subtarea con ID: " + id + " y estado: " + completed);
        return completionUseCase.execute(id, completed);
    }

    @Getter
    @Setter
    @AllArgsConstructor
    static class CreateSubtaskResponse {
        private UUID id;
        private String title;
        private boolean completed;
    }

    @Setter
    @Getter
    static class CreateSubtaskRequest {
        private String title;
    }

}
