package com.eficientis.projects.tasks.subtasks.application;

import com.eficientis.projects.tasks.subtasks.domain.SubtaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class DeleteSubtaskUseCase {
    private final SubtaskRepository subtaskRepository;

    public void execute(UUID id) {
        subtaskRepository.deleteById(id);
    }
}
