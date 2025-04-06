package tasks

func ToEntity(t Task) TaskEntity {
	return TaskEntity{
		ID: t.ID,
		Title: t.Title,
		Description: t.Description,
		CreationDate: t.CreationDate,
		ClosingDate: t.ClosingDate,
		Status: t.Status,
		ProjectID: t.ProjectID,
	}
}

func ToDomain(te TaskEntity) Task {
	return Task{
		ID: te.ID,
		Title: te.Title,
		Description: te.Description,
		CreationDate: te.CreationDate,
		ClosingDate: te.ClosingDate,
		Status: te.Status,
		ProjectID: te.ProjectID,
	}
}