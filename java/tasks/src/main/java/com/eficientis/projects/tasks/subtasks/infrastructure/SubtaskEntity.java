package com.eficientis.projects.tasks.subtasks.infrastructure;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "subtask")
public class SubtaskEntity {
    @Id
    private UUID id;
    private String title;
    private boolean completed;
}
