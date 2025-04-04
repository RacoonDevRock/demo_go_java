package com.eficientis.projects.tasks; // indica que ubicacion tiene en el paquete

// importaciones para los decoradores, indican desde donde provienen
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.eficientis") // marca el punto de entrada de tu aplicación
public class TasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasksApplication.class, args);
	}

}
