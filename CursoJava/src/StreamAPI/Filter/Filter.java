package StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8); 
		Aluno a2 = new Aluno("lucas", 9.8); 
		Aluno a3 = new Aluno("João", 5.8); 
		Aluno a4 = new Aluno("Maria", 6.8); 
		Aluno a5 = new Aluno("Pedro",10.0); 
		Aluno a6 = new Aluno("Bruna", 8.8); 
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> alunoAprovado = a -> "Parabens " + a.nome + " você foi aprovado(a)";
		
		alunos.stream()
			.filter(aprovado)
			.map(alunoAprovado)
			.forEach(System.out::println);
		
	}

}
