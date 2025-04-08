package com.eficientis.project.users.application.ports.in;

import com.eficientis.project.users.application.dto.RegisterRequestDTO;
import com.eficientis.project.users.application.dto.UserDTO;

public interface RegisterUseCase {
    UserDTO register(RegisterRequestDTO registerRequestDTO);
}