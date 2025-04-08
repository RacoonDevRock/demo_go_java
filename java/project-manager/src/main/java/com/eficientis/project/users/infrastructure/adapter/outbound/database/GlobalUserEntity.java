package com.eficientis.project.users.infrastructure.adapter.outbound.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "global_users", schema = "public")
public class GlobalUserEntity {

    @Id
    private UUID id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "hashed_password", nullable = false)
    private String hashedPassword;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "is_system_admin")
    private boolean isSystemAdmin;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
