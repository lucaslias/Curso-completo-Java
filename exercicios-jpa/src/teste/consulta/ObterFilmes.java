package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.MuitosPraMuitos.Ator;
import modelo.MuitosPraMuitos.Filme;

public class ObterFilmes {
	
	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);
		
		for(Filme filme:filmes) {
			System.out.println(filme.getNome());
		
			for(Ator ator:filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	
	}
}
