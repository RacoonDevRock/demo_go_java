package com.eficientis.project.users.domain.model;

public class User {
    private UserId id;
    private String email;
    private String hashedPassword;
    private String displayName;
    private String avatarUrl;
    private String isLoginDate;
    private boolean isGlobalAdmin;

    public User(UserId id, String email, String hashedPassword, String displayName, boolean isGlobalAdmin) {
        this.id = id;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.displayName = displayName;
        this.isGlobalAdmin = isGlobalAdmin;
    }

    public User(UserId id, String email, String hashedPassword, String displayName, boolean isGlobalAdmin, String avatarUrl, String isLoginDate) {
        this.id = id;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.displayName = displayName;
        this.isGlobalAdmin = isGlobalAdmin;
        this.avatarUrl = avatarUrl;
        this.isLoginDate = isLoginDate;
    }

    public User() {}

    public UserId getId() {
        return id;
    }

    public void setId(UserId id) {
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

    public boolean isGlobalAdmin() {
        return isGlobalAdmin;
    }

    public void setGlobalAdmin(boolean globalAdmin) {
        isGlobalAdmin = globalAdmin;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public String getIsLoginDate() {
        return isLoginDate;
    }

    public void setIsLoginDate(String isLoginDate) {
        this.isLoginDate = isLoginDate;
    }
}
