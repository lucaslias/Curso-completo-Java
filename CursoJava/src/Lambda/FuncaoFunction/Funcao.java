package Lambda.FuncaoFunction;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		//recebe um elemento e recebe um resultado, ambos definidos no generics (podem ser diferentes)
		
		
		//recebe int e retorna String
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "Impar";
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> isResultado = valor -> "O resulado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + " !!!";
		
		//composição de funções
		String resultadoFinal = parOuImpar.andThen(isResultado).andThen(empolgado).apply(33);
		System.out.println(resultadoFinal);
		
		
	}

}
