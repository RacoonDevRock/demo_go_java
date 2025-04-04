package com.eficientis.projects.tasks.subtasks.application;

import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import com.eficientis.projects.tasks.subtasks.domain.SubtaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class UpdateSubtaskUseCase {
    private final SubtaskRepository subtaskRepository;

    public Subtask execute(UUID id, Subtask newSubtask) {
        Optional<Subtask> subtaskOptional = subtaskRepository.findById(id);

        Subtask subtask = subtaskOptional.get();
        subtask.setTitle(newSubtask.getTitle());
        subtask.setCompleted(newSubtask.isCompleted());

        return subtaskRepository.save(subtask);
    }
}
