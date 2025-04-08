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

    @Column(nullable = false, unique = true)
    private String email;

    @Column(name = "hashed_password")
    private String hashedPassword;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "avatar_url", nullable = true)
    private String avatarUrl;

    @Column(name = "is_login_date", nullable = true)
    private String isLoginDate;

    @Column(name = "is_global_admin")
    private boolean isGlobalAdmin;

    public UserEntity(UUID id, String email, String hashedPassword, String displayName, boolean isGlobalAdmin) {
        this.id = id;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.displayName = displayName;
        this.isGlobalAdmin = isGlobalAdmin;
    }
}
