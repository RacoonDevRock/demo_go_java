package com.eficientis.project.users.application.ports.in;

import com.eficientis.project.users.application.dto.AuthRequestDTO;
import com.eficientis.project.users.domain.model.GlobalUser;

public interface GlobalLoginUseCase {
    GlobalUser globalLogin(AuthRequestDTO authRequestDTO);
}
