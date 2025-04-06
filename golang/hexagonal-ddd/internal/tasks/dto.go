package tasks

import "time"

type TaskDTO struct {
	Title       string `json:"title"`
	Description string `json:"description"`
	CreationDate time.Time `json:"creation_date"`
	ClosingDate time.Time  `json:"closing_date"`
	Status string `json:"status"`
	ProjectID   string `json:"project_id"`
}