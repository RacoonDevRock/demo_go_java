package com.eficientis.project.users.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GlobalUserDTO {
    private String email;
    private String password;
}
