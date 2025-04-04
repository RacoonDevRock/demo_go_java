package com.eficientis.projects.tasks.notifications.infrastructure;

import com.eficientis.projects.tasks.notifications.application.NotifyOnSubtaskCreatedUseCase;
import com.eficientis.projects.tasks.subtasks.domain.events.SubtaskCreatedEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class NotificationListener {
    private final NotifyOnSubtaskCreatedUseCase useCase;

    @EventListener
    public void onSubtaskCreated(SubtaskCreatedEvent event) {
        useCase.execute(event.getSubtaskId());
    }
}
