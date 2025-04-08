package com.eficientis.project.users.infrastructure.adapter.outbound.database;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    private UUID id;
    private String email;

    @Column(name = "hashed_password")
    private String hashedPassword;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "is_global_admin")
    private boolean isGlobalAdmin;
}
