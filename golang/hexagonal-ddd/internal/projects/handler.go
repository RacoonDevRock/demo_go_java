package projects

import (
	"context"
)

// encore:api public method=POST path=/api/projects
func Create(ctx context.Context, input ProjectDTO) error {
	return CreateProject(ctx, input)
}

// encore:api public method=GET path=/api/projects
func GetAll(ctx context.Context) (ProjectsResponse, error) {
	projects, err := ListProjects(ctx)
	if err != nil {
		return ProjectsResponse{}, err
	}
	return ProjectsResponse{Projects: projects}, nil
}

// encore:api public method=PATCH path=/api/projects/:id/status/:status
func UpdateStatus(ctx context.Context, id string, status string) error {
	return UpdateProjectStatus(ctx, id, status)
}

