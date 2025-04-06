package tasks

import "time"

type TaskEntity struct {
	ID           string
	Title        string
	Description  string
	CreationDate time.Time
	ClosingDate  time.Time
	Status       string
	ProjectID    string
}