package projects

import "context"

type Repository interface {
	Save(ctx context.Context, project Project) error
	FindAll(ctx context.Context) ([]Project, error)
	UpdateStatus(projectID string, status string) error
}