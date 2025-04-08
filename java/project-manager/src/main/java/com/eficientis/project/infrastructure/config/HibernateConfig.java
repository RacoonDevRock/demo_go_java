package com.eficientis.project.infrastructure.config;

import com.eficientis.project.infrastructure.tenant.hibernate.SchemaPerTenantConnectionProvider;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class HibernateConfig {

    @Autowired
    private SchemaPerTenantConnectionProvider connectionProvider;

    @Autowired
    private CurrentTenantIdentifierResolver tenantIdentifierResolver;

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(DataSource dataSource) {
        Map<String,Object> hibernateProps = new HashMap<>();

        hibernateProps.put(AvailableSettings.MULTI_TENANT_CONNECTION_PROVIDER, connectionProvider);
        hibernateProps.put(AvailableSettings.MULTI_TENANT_IDENTIFIER_RESOLVER, tenantIdentifierResolver);

        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setDataSource(dataSource);
        emf.setPackagesToScan("com.eficientis.project"); // <- importante
        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        emf.setJpaPropertyMap(hibernateProps);
        return emf;
    }
}
