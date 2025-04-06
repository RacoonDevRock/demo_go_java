package com.eficientis.projects.tasks.subtasks.application;

import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import com.eficientis.projects.tasks.subtasks.domain.SubtaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GetAllSubtaskUseCase {
    private final SubtaskRepository subtaskRepository;

    public List<Subtask> execute() {
        return subtaskRepository.findAll();
    }
}
