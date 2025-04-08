package com.eficientis.project.tenant.domain.model;

import com.eficientis.project.tenant.domain.model.enums.SubscriptionStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tenant {
    private TenantId id;
    private String name;
    private String subdomain;
    private SubscriptionStatus subscriptionStatus;
    private LocalDate trialEndDate;
    private LocalDateTime createdDate;

    public Tenant(TenantId id, String name, String subdomain, SubscriptionStatus subscriptionStatus, LocalDate trialEndDate, LocalDateTime createdDate) {
        this.id = id;
        this.name = name;
        this.subdomain = subdomain;
        this.subscriptionStatus = subscriptionStatus;
        this.trialEndDate = trialEndDate;
        this.createdDate = createdDate;
    }

    public Tenant() {}

    public TenantId getId() {
        return id;
    }

    public void setId(TenantId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }

    public SubscriptionStatus getSubscriptionStatus() {
        return subscriptionStatus;
    }

    public void setSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public LocalDate getTrialEndDate() {
        return trialEndDate;
    }

    public void setTrialEndDate(LocalDate trialEndDate) {
        this.trialEndDate = trialEndDate;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}