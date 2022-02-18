package br.com.empresa.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresa.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/qualquer")
	public Cliente obterClientte() {
		return new Cliente(28,"Lucas", "123456-78");
	}
	
	@GetMapping("/{id}")
	public Cliente ClientePorId1(@PathVariable int id) {
		return new Cliente(id, "maria", "93255675-19");	
	}
	
	@GetMapping
	public Cliente ClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "joao", "34255675-45");	
	}

}
