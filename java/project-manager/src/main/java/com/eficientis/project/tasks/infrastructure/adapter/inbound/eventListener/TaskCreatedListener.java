package com.eficientis.project.tasks.infrastructure.adapter.inbound.eventListener;

import com.eficientis.project.tasks.application.event.TaskCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TaskCreatedListener {

    @EventListener
    public void onTaskCreated(TaskCreatedEvent event) {
        System.out.println("NEW TASK: " + event.getTitle() + " FOR PROJECT ID: " + event.getProjectId());
    }
}
