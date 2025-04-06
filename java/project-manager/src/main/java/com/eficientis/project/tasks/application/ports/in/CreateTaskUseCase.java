package com.eficientis.project.tasks.application.ports.in;

import com.eficientis.project.tasks.application.dto.TaskDTO;

public interface CreateTaskUseCase {
    void execute(TaskDTO dto);
}
