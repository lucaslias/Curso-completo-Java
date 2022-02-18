package br.com.empresa.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.empresa.exerciciossb.model.entities.ItensPedido;
import br.com.empresa.exerciciossb.model.entities.Pedido;
import br.com.empresa.exerciciossb.model.entities.Produto;
import br.com.empresa.exerciciossb.model.repositories.ItensPedRepository;
import br.com.empresa.exerciciossb.model.repositories.PedidoRepository;
import br.com.empresa.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/pedido")
public class PedidosController {
	
	@Autowired 
	private PedidoRepository pedidoRepository;

	@Autowired 
	private ItensPedRepository pedidoItensRepository;
	
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Pedido novoPedido(@Valid @RequestBody Pedido pedido) { 
		pedidoRepository.save(pedido);
		
		return pedido;
	}
}