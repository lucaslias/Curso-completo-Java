package StreamAPI.minMax;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import StreamAPI.Reduce.Aluno;

public class Exemplo {
	
	public static void main(String[] args) {
			
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("lucas", 6.1);
		Aluno a3 = new Aluno("gui", 8.1);
		Aluno a4 = new Aluno("gabi", 10);
			
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			 if(aluno1.nota > aluno2.nota) return 1;
			 if(aluno1.nota < aluno2.nota) return -1;
			 return 0;
			};
			
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		
	}

}
