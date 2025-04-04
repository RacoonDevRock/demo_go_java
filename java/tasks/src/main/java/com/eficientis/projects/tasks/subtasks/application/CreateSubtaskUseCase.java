package com.eficientis.projects.tasks.subtasks.application;

import com.eficientis.projects.tasks.infrastructure.shared.DomainEventPublisher;
import com.eficientis.projects.tasks.subtasks.domain.Subtask;
import com.eficientis.projects.tasks.subtasks.domain.SubtaskRepository;
import com.eficientis.projects.tasks.subtasks.domain.events.SubtaskCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CreateSubtaskUseCase {
    private final SubtaskRepository repository;
    private final DomainEventPublisher domainEventPublisher;

    public Subtask execute(String title) {
        Subtask subtask = new Subtask(UUID.randomUUID(), title, false);
        repository.save(subtask);
        domainEventPublisher.publish(new SubtaskCreatedEvent(subtask.getId()));
        return subtask;
    }
}