package com.eficientis.project.users.application.ports.in;

import com.eficientis.project.users.application.dto.AuthRequestDTO;
import com.eficientis.project.users.application.dto.UserDTO;

public interface LoginUseCase {
    UserDTO login(AuthRequestDTO authRequestDTO);
}