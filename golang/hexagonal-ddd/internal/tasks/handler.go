package tasks

import (
	"context"
)

// encore:api public method=POST path=/api/tasks
func Create(ctx context.Context, input TaskDTO) error {
	return CreateTask(ctx, input)
}