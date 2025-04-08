CREATE TABLE IF NOT EXISTS tenants (
    id UUID PRIMARY KEY,
    name VARCHAR(255),
    subdomain VARCHAR(255) UNIQUE,
    subscription_status VARCHAR(50),
    trial_end_date DATE,
    created_date TIMESTAMP
);
