package projects

import "time"

type ProjectDTO struct {
	Name        string  `json:"name"`
	Description string  `json:"description"`
	StartDate   time.Time `json:"start_date"`
	EndDate     time.Time `json:"end_date"`
}

type ProjectsResponse struct {
	Projects []Project `json:"projects"`
}