package com.eficientis.projects.tasks.infrastructure.shared;

import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DomainEventPublisher {
    private final ApplicationEventPublisher eventPublisher;

    public void publish(Object event) {
        eventPublisher.publishEvent(event);
    }
}

/*
Existe debido a:
- No contiene nada específivo de un módulo.
- Es una clase genérica puede ser reusada por varios contextos.
- No posee lógica de negocio.
 */
