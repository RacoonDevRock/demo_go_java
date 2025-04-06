package projects

func ToEntity(p Project) ProjectEntity {
	return ProjectEntity{
		ID:          p.ID,
		Name:        p.Name,
		Description: p.Description,
		StartDate:   p.StartDate,
		EndDate:     p.EndDate,
		Status:      p.Status,
	}
}

func ToDomain(pe ProjectEntity) Project {
	return Project{
		ID:          pe.ID,
		Name:        pe.Name,
		Description: pe.Description,
		StartDate:   pe.StartDate,
		EndDate:     pe.EndDate,
		Status:      pe.Status,
	}
}
