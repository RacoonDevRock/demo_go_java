package com.eficientis.projects.tasks.notifications.application;

import com.eficientis.projects.tasks.notifications.domain.Notification;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class NotifyOnSubtaskCreatedUseCase {
    private final NotificationService notificationService;

    public Notification execute(UUID subtaskId) {
        return notificationService.notifySubtaskCreated(subtaskId);
    }
}
