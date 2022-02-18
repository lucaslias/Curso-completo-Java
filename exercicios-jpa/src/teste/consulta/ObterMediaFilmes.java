package teste.consulta;

import infra.DAO;
import modelo.MuitosPraMuitos.Filme;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {
	
	public static void main(String[] args) {
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("ObterMediaGeralDosFilme");
		
		System.out.println(nota.getMedia());
		
		
		DAO<Filme> dao2 = new DAO<>(Filme.class);
		Filme nota2 = dao2.consultarUm("teste", "id", 1);
		System.out.println(nota2.getNome());
		
		
		
	}

}
