package tasks

import (
	"context"
	"hexagonal-ddd/internal/shared"
)

// var store = make(map[string]TaskEntity)
// var mu sync.Mutex

type PostgresRepository struct{}

func (r *PostgresRepository) Save(ctx context.Context, task Task) error {
	_, err := shared.DB.Exec(ctx, `
		INSERT INTO tasks (id, title, description, creation_date, closing_date, status, project_id)
		VALUES ($1, $2, $3, $4, $5, $6, $7)
	`, task.ID, task.Title, task.Description, task.CreationDate, task.ClosingDate, task.Status, task.ProjectID)

	return err;
}

func (r *PostgresRepository) FindAll() ([]Task, error) {
	// TODO: implement
	return nil, nil
}