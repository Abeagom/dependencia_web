package com.hlc.dependencia_web.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PruebaControlador {
	//Función
	private int suma(int a, int b) {
		return a+b;
	}
	
	@GetMapping("/funcion")
	public int funcion() {
		//Uso de funciones
		return suma(5,3);
	}
	
	@GetMapping("/decision")
	public String decision(@RequestParam int number) {
		//Mecanismos de decisión
		if(number<10) {
			return "El número " + number + " es menor que 10.";
		}else {
			return "El número " + number + " es mayor o igual a 10.";
		}
	}
	
}
