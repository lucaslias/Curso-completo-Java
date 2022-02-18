package br.com.empresa.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	
	@GetMapping("/{a}/{b}")
	public String somar(@PathVariable int a, @PathVariable int b) {
		return "A soma é " + (a+b);
	}
	
	
	@GetMapping("/subtrair")
	public String subtrair(@RequestParam(name = "a", defaultValue = "10") int a, @RequestParam(name = "b", defaultValue = "20") int b) {
		
		return "A subtração é " + (a-b);
	}
	
	


	
	

}
