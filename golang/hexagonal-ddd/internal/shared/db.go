package shared

import "encore.dev/storage/sqldb"

var DB = sqldb.NewDatabase("projects", sqldb.DatabaseConfig{
	Migrations: "./migrations",
})