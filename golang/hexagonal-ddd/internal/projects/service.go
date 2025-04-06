package projects

import (
	"context"

	"github.com/google/uuid"
)

var repository Repository = &PostgresRepository{}

func CreateProject(ctx context.Context, input ProjectDTO) error {
	id := uuid.New().String()
	project := Project{
		ID:          id,
		Name:        input.Name,
		Description: input.Description,
		StartDate:   input.StartDate,
		EndDate:     input.EndDate,
		Status:      "NOT_STARTED",
	}
	return repository.Save(ctx, project)
}

func ListProjects(ctx context.Context) ([]Project, error) {
	return repository.FindAll(ctx)
}

func UpdateProjectStatus(_ context.Context, id string, newStatus string) error {
	return repository.UpdateStatus(id, newStatus)
}