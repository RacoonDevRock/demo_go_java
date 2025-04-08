package com.eficientis.project.users.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RegisterRequestDTO {
    private String email;
    private String password;
    private String displayName;
}
