package com.eficientis.project.users.domain.model;

import java.time.LocalDateTime;

public class GlobalUser {
    private GlobalUserId id;
    private String email;
    private String hashedPassword;
    private String displayName;
    private boolean isSystemAdmin;
    private LocalDateTime createdAt;

    public GlobalUser(GlobalUserId id, String email, String hashedPassword, String displayName, boolean isSystemAdmin, LocalDateTime createdAt) {
        this.id = id;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.displayName = displayName;
        this.isSystemAdmin = isSystemAdmin;
        this.createdAt = createdAt;
    }


    public GlobalUser(GlobalUserId id, String email, String hashedPassword, String displayName, boolean isSystemAdmin) {
        this.id = id;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.displayName = displayName;
        this.isSystemAdmin = isSystemAdmin;
    }

    public GlobalUserId getId() {
        return id;
    }

    public void setId(GlobalUserId id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isSystemAdmin() {
        return isSystemAdmin;
    }

    public void setSystemAdmin(boolean systemAdmin) {
        isSystemAdmin = systemAdmin;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
