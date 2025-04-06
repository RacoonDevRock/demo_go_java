package projects

import (
	"context"
	"errors"
	"hexagonal-ddd/internal/shared"
	"sync"
)

var store = make(map[string]ProjectEntity)
var mu sync.Mutex

type PostgresRepository struct {}

func (r *PostgresRepository) Save(ctx context.Context,project Project) error {
	_, err := shared.DB.Exec(ctx, `
		INSERT INTO projects (id, name, description, start_date, end_date, status)
		VALUES ($1, $2, $3, $4, $5, $6)
	`, project.ID, project.Name, project.Description, project.StartDate, project.EndDate, project.Status)

	return err;
}

func (r *PostgresRepository) FindAll(ctx context.Context) ([]Project, error) {
    rows, err := shared.DB.Query(ctx, `SELECT id, name, description, start_date, end_date, status FROM projects`)
    if err != nil {
        return nil, err
    }
    defer rows.Close()

    var projects []Project
    for rows.Next() {
        var p Project
        if err := rows.Scan(&p.ID, &p.Name, &p.Description, &p.StartDate, &p.EndDate, &p.Status); err != nil {
            return nil, err
        }
        projects = append(projects, p)
    }

    return projects, nil
}

func (r *PostgresRepository) UpdateStatus(projectID string, status string) error {
	mu.Lock()
	defer mu.Unlock()
	entity, ok := store[projectID]
	if !ok {
		return errors.New("project not found")
	}
	entity.Status = status
	store[projectID] = entity
	return nil
}