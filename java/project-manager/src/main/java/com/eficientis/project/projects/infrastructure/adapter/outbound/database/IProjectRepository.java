package com.eficientis.project.projects.infrastructure.adapter.outbound.database;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProjectRepository extends JpaRepository<ProjectEntity, UUID> {
}
