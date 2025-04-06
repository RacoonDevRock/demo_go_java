package tasks

import "context"

type Repository interface {
	Save(ctx context.Context, task Task) error
	FindAll() ([]Task, error)
}