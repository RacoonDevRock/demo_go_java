package com.eficientis.projects.tasks.subtasks.infrastructure;

import com.eficientis.projects.tasks.subtasks.domain.events.SubtaskCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubtaskCreatedListener {

    @EventListener
    public void handle(SubtaskCreatedEvent event) {
        System.out.println("Subtask creada con ID " + event.getSubtaskId());
    }
}
