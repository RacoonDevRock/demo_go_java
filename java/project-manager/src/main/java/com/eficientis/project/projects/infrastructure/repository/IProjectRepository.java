package com.eficientis.project.projects.infrastructure.repository;

import com.eficientis.project.projects.infrastructure.persistence.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IProjectRepository extends JpaRepository<ProjectEntity, UUID> {
}
