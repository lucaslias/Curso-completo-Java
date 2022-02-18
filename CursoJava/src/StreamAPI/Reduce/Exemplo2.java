package StreamAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exemplo2 {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("ana", 7.1);
		Aluno a2 = new Aluno("lucas", 6.1);
		Aluno a3 = new Aluno("gui", 8.1);
		Aluno a4 = new Aluno("gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >=7;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BinaryOperator<Double> somatorio = (a,b) -> a + b;
		
		alunos.parallelStream()
			.filter(aprovado)
			.map(apenasNota)
			.reduce(somatorio)
			.ifPresent(System.out::println);
		

	}
	

}
