package com.eficientis.projects.tasks.helloworldexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // decorador para un controlador con response JSON
//@Controller // decorador para un controlador con response HTML
@RequestMapping("/api/controller") // prefijo del endpoint
public class SaludoController {

    @GetMapping // endpoint redirijo a la raiz
    public String holaMundo() {
        return "Hola Mundo";
    }
}
