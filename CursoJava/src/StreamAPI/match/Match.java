package StreamAPI.match;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import StreamAPI.Reduce.Aluno;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("lucas", 6.1);
		Aluno a3 = new Aluno("gui", 8.1);
		Aluno a4 = new Aluno("gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		
		//todos os alunos foram aprovados?
		System.out.println(alunos.stream().allMatch(aprovado));
		
		//pelo menos um foi aprovado?
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		//nenhum aluno foi aprovado?
		System.out.println(alunos.stream().noneMatch(aprovado));
			//System.out.println(alunos.stream().noneMatch(aprovado.negate())); existe também a negação
		
	}

}
