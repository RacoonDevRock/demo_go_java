package com.eficientis.project.users.infrastructure.adapter.outbound.database.mappers;

import com.eficientis.project.users.domain.model.GlobalUser;
import com.eficientis.project.users.domain.model.GlobalUserId;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.GlobalUserEntity;
import org.springframework.stereotype.Component;

@Component
public class GlobalUserEntityMapper {
    public static GlobalUser toDomain(GlobalUserEntity entity) {
        return new GlobalUser(
                new GlobalUserId(entity.getId()),
                entity.getEmail(),
                entity.getHashedPassword(),
                entity.getDisplayName(),
                entity.isSystemAdmin(),
                entity.getCreatedAt()
        );
    }
}