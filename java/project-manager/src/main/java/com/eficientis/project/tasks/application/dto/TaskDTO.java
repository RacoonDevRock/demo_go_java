package com.eficientis.project.tasks.application.dto;

import com.eficientis.project.tasks.domain.model.TaskStatus;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    @NotBlank
    private String title;

    @NotBlank
    private String description;

    @NotNull
    private TaskStatus status;

    @NotNull
    private LocalDate closingDate;

    @NotNull
    private UUID projectId;
}
