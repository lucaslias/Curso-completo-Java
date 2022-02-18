package br.com.empresa.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/ola")
	//@GetMapping(path = {"/ola","/saudacao"}) //pode colocar mais de um caminho
	@GetMapping(path = "/ola")
	public String ola() {
		return "ola spring boot!";
	}
	
	@PostMapping(path = "/ola")
	public String ola2() {
		return "ola spring boot!"; 
	}
	
}
