package br.com.empresa.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.empresa.exerciciossb.model.entities.Produto;

//public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{ //tem tudo do anterior e mais algumas
	
	public Iterable<Produto> findByNomeContainingIgnoreCase(String pareNome); //tem que uilizar as convencoes de nome do spring
	
	//algumas convencoes
		//findByNomeContainig
		//findByNomeIsContaining
		//findByNomeContains
	
		//findByNomeStartWith
		//findByNomeEndsWith
	
		//findByNomeNotContaining
	
		//em todas pode colocar o ignore case no final
	
	@Query("SELECT p FROM Produto p WHERE p.preco < :preco")
	public Iterable<Produto> searchByPreco(@Param("preco") double preco);
	

}
