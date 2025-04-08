package com.eficientis.project.tenant.infrastructure.adapter.outbound.database;

import com.eficientis.project.tenant.domain.model.enums.SubscriptionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tenants", schema = "public")
public class TenantEntity {

    @Id
    private UUID id;
    private String name;
    private String subdomain;

    @Enumerated(EnumType.STRING)
    @Column(name = "subscription_status")
    private SubscriptionStatus subscriptionStatus;

    @Column(name = "trial_end_date")
    private LocalDate trialEndDate;

    @Column(name = "created_date")
    private LocalDateTime createdDate;
}