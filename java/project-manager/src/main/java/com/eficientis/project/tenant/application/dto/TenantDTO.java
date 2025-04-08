package com.eficientis.project.tenant.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class TenantDTO {
//    private UUID id;
    private String name;
    private String subdomain;
    private String subscriptionStatus;
    private LocalDate trialEndDate;
    private LocalDateTime createdDate;
}