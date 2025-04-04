package com.eficientis.projects.tasks.notifications.application;

import com.eficientis.projects.tasks.notifications.domain.Notification;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class NotificationService {
    public Notification notifySubtaskCreated(UUID subtaskId) {
        String message = "Se ha creado una nueva Subtask ID: " + subtaskId;
        Notification notification = new Notification(UUID.randomUUID(), message);

        System.out.println("Notification enviada" + message);

        return notification;
    }
}
