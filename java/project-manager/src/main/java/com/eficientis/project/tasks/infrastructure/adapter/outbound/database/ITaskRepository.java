package com.eficientis.project.tasks.infrastructure.adapter.outbound.database;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITaskRepository extends JpaRepository<TaskEntity, UUID> {
}
