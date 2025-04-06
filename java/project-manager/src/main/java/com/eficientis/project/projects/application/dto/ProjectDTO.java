package com.eficientis.project.projects.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class ProjectDTO {

    @NotBlank
    public String name;

    @NotBlank
    public String description;

    @NotNull
    public LocalDate startDate;

    @NotNull
    public LocalDate endDate;
}
