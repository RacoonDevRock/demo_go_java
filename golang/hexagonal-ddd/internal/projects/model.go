package projects

import "time"

type Project struct {
	ID          string
	Name        string
	Description string
	StartDate   time.Time
	EndDate     time.Time
	Status      string
}