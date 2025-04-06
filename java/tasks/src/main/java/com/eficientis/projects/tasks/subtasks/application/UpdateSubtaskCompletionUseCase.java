package com.eficientis.projects.tasks.subtasks.application;

import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import com.eficientis.projects.tasks.subtasks.domain.SubtaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UpdateSubtaskCompletionUseCase {
    private final SubtaskRepository subtaskRepository;

    public Subtask execute(UUID id, boolean completed) {
        Optional<Subtask> subtaskOptional = subtaskRepository.findById(id);

        Subtask subtask = subtaskOptional.get();
        subtask.setCompleted(completed);

        return subtaskRepository.save(subtask);
    }
}
