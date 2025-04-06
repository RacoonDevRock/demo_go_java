package com.eficientis.projects.tasks.subtasks.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

// autogenera save(), findAll(), deleteById()
public interface JPASubtaskRepository extends JpaRepository<SubtaskEntity, UUID> {
}
