package com.eficientis.project.users.infrastructure.adapter.outbound.database.mappers;

import com.eficientis.project.users.domain.model.User;
import com.eficientis.project.users.domain.model.UserId;
import com.eficientis.project.users.infrastructure.adapter.outbound.database.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserEntityMapper {
    public static User toDomain(UserEntity entity) {
        return new User(
                new UserId(entity.getId()),
                entity.getEmail(),
                entity.getHashedPassword(),
                entity.getDisplayName(),
                entity.isGlobalAdmin()
        );
    }

    public static UserEntity toEntity(User user) {
        return new UserEntity(
                new UserId(user.getId().value()).value(),
                user.getEmail(),
                user.getHashedPassword(),
                user.getDisplayName(),
                user.isGlobalAdmin()
        );
    }
}