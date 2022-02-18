package StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	//duas funções lambdas para fazer 2 filtros diferentes 
	//depois usar map
	
	public static void main(String[] args) {
		
		AlunoDesafio1 a1 = new AlunoDesafio1("Ana", 7.8, 2); 
		AlunoDesafio1 a2 = new AlunoDesafio1("lucas", 9.8, 0); 
		AlunoDesafio1 a3 = new AlunoDesafio1("João", 5.8, 7); 
		AlunoDesafio1 a4 = new AlunoDesafio1("Maria", 6.8, 12); 
		AlunoDesafio1 a5 = new AlunoDesafio1("Pedro",10.0, 7); 
		AlunoDesafio1 a6 = new AlunoDesafio1("Bruna", 8.8, 9); 
		
		int quantidadePermitida =(int) ((int) 25 * 0.25);
		
		List<AlunoDesafio1> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);
		
		Predicate<AlunoDesafio1> aprovadoNota = a -> a.nota >= 7;
		Predicate<AlunoDesafio1> aprovadoFalta = a -> a.faltas <= quantidadePermitida;
		Function<AlunoDesafio1, String> alunoAprovado = a -> "Parabens " + a.nome + " você foi aprovado(a)";
		
		alunos.stream()
			.filter(aprovadoNota)
			.filter(aprovadoFalta)
			.map(alunoAprovado)
			.forEach(System.out::println);
		
		
	}
	
	

}
