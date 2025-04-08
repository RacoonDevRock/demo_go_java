package com.eficientis.project.infrastructure.tenant.database;

import lombok.RequiredArgsConstructor;
import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@RequiredArgsConstructor
public class TenantSchemaCreator {
    private final DataSource dataSource;

    public void createSchema(String schemaName) {
//        jdbcTemplate.execute("CREATE SCHEMA IF NOT EXISTS " + schemaName); // sin flyway
        Flyway.configure()
                .dataSource(dataSource)
                .schemas(schemaName)
                .locations("classpath:db/migration")
                .baselineOnMigrate(true) // evita errores si está vacío
                .load()
                .migrate();
    }
}
