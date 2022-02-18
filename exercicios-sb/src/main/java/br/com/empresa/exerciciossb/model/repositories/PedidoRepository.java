package br.com.empresa.exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.empresa.exerciciossb.model.entities.Pedido;


public interface PedidoRepository extends PagingAndSortingRepository<Pedido, Integer>{


}
