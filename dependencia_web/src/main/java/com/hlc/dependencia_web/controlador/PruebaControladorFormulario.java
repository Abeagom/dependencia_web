package com.hlc.dependencia_web.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PruebaControladorFormulario {

    @GetMapping("/formulario")
    public String mostrarFormulario() {
        // Esto devolverá el template "formulario.html"
        return "formulario";
    }
	@PostMapping("/formulario")
	@ResponseBody
	public String formulario(@RequestParam String nombre, @RequestParam int edad, @RequestParam String color ) {
		String mensaje = edad>=18 ? "mayor de edad":"menor de edad";
		//Construir la respuesta incluyendo el color seleccionado
		return String.format("<h1>Hola, %s. Tienes %d años, eres %s y seleccionaste el color %s. </h1>", nombre, edad, mensaje, color);
	}
	
}
