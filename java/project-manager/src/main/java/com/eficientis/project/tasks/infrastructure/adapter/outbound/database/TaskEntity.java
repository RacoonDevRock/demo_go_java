package com.eficientis.project.tasks.infrastructure.adapter.outbound.database;

import com.eficientis.project.tasks.domain.model.TaskStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks")
public class TaskEntity {

    @Id
    private UUID id;
    private String title;
    private String description;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "closing_date")
    private LocalDate closingDate;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column(name = "project_id", nullable = false)
    private UUID projectId;
}
