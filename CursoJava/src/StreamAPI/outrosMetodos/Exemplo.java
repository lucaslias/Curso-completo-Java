package StreamAPI.outrosMetodos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import StreamAPI.Reduce.Aluno;

public class Exemplo {
	
	public static void main(String[] args) {
		

	Aluno a1 = new Aluno("ana", 7.1);
	Aluno a2 = new Aluno("lucas", 6.1);
	Aluno a3 = new Aluno("gui", 8.1);
	Aluno a4 = new Aluno("gabi", 10);
	Aluno a5 = new Aluno("ana", 7.1);
	Aluno a6 = new Aluno("lucas", 6.1);
	Aluno a7 = new Aluno("gui", 8.1);
	Aluno a8 = new Aluno("gabi", 10);
	
	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
	
	System.out.println("---- distinct -----");
	alunos.stream().distinct().forEach(System.out::println);
	
	System.out.println("\n ---- skip -----");
	alunos.stream()
		.distinct()
		.skip(2) //pula 2 elementos
		.forEach(System.out::println);
	
	System.out.println("\n ---- Limit -----");
	alunos.stream()
		.distinct()
		.limit(2) //pula 2 elementos
		.forEach(System.out::println);
	
	System.out.println("\n ---- take while -----"); //pegue até a condição
	alunos.stream()
		.distinct()
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
	
	
	
	}

}
