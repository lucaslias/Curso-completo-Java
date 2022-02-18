package teste.heranca;

import infra.DAO;
import modelo.Heranca.Aluno;
import modelo.Heranca.AlunoBolsista;

public class NovoAluno {
	
	public static void main(String[] args) {
		 
		DAO<Aluno> alunoDAO = new DAO<>();

		//SINGLE_TABLE
			Aluno aluno = new Aluno(123L, "João");
			AlunoBolsista aluno2 = new AlunoBolsista(345L, "Maria", 1000);
			
			alunoDAO.incluirAtomico(aluno);
			alunoDAO.incluirAtomico(aluno2);
			
			alunoDAO.fechar();
		
	}

}
