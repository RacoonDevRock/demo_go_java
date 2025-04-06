package tasks

import (
	"context"

	"github.com/google/uuid"
)

var repository Repository = &PostgresRepository{}

func CreateTask(ctx context.Context, input TaskDTO) error {
	id := uuid.New().String()
	task := Task{
		ID: id,
		Title: input.Title,
		Description: input.Description,
		CreationDate: input.CreationDate,
		ClosingDate: input.ClosingDate,
		Status: input.Status,
		ProjectID: input.ProjectID,
	}
	return repository.Save(ctx, task)
}