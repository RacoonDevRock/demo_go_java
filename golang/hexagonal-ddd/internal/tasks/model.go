package tasks

import "time"

type Task struct {
	ID           string
	Title        string
	Description  string
	CreationDate time.Time
	ClosingDate  time.Time
	Status       string
	ProjectID    string
}