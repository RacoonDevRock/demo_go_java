package com.eficientis.project.tasks.application.service;

import com.eficientis.project.tasks.application.dto.TaskDTO;
import com.eficientis.project.tasks.application.event.TaskCreatedEvent;
import com.eficientis.project.tasks.application.ports.in.CreateTaskUseCase;
import com.eficientis.project.tasks.domain.model.Task;
import com.eficientis.project.tasks.domain.model.TaskStatus;
import com.eficientis.project.tasks.domain.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateTaskService implements CreateTaskUseCase {
    private final TaskRepository taskRepository;
    private final ApplicationEventPublisher eventPublisher;

    @Override
    public void execute(TaskDTO dto) {
        Task task = new Task(
                UUID.randomUUID(),
                dto.getTitle(),
                dto.getDescription(),
                LocalDate.now(),
                dto.getClosingDate(),
                TaskStatus.PENDING,
                dto.getProjectId()
        );
        taskRepository.save(task);

        eventPublisher.publishEvent(new TaskCreatedEvent(
                dto.getProjectId(), task.getId(), task.getTitle()
        ));
    }
}
