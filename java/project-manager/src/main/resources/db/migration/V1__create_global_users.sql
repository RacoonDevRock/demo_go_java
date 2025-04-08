CREATE TABLE IF NOT EXISTS public.global_users (
    id UUID PRIMARY KEY,
    email VARCHAR(255) UNIQUE NOT NULL,
    hashed_password VARCHAR(255) NOT NULL,
    display_name VARCHAR(255),
    is_system_admin BOOLEAN DEFAULT false,
    created_at TIMESTAMP DEFAULT now()
);
