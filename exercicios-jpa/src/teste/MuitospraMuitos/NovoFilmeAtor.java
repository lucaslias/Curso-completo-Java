package teste.MuitospraMuitos;

import infra.DAO;
import modelo.MuitosPraMuitos.Ator;
import modelo.MuitosPraMuitos.Filme;

public class NovoFilmeAtor {
	
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("carros1", 9.3);
		Filme filmeB = new Filme("carros1", 8.5);
		
		Ator ator1 = new Ator("teste", 8.3);
		Ator ator2 = new Ator("nomeDoAutor", 5.6);
		
		filmeA.adicionarAtor(ator2);
		filmeA.adicionarAtor(ator1);
		
		filmeB.adicionarAtor(ator2);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		dao.incluirAtomico(filmeB);
		
		dao.fechar();
		
		
		
		
		
		}

}
