-- migrations/2_create_tasks_table.up.sql
CREATE TABLE tasks (
    id UUID PRIMARY KEY,
    title TEXT NOT NULL,
    description TEXT,
    creation_date DATE,
    closing_date DATE,
    status TEXT,
    project_id UUID REFERENCES projects(id) ON DELETE CASCADE
);
