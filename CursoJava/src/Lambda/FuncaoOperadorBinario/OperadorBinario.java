package Lambda.FuncaoOperadorBinario;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1,n2) -> (n1 + n2 ) / 2;
		System.out.println(media.apply(9.8, 5.7));
		
		BiFunction<Double, Double, String> resultado = (n1, n2) -> (n1+n2)/2 >= 7 ? "APROVADO" : "REPROVADO";
		System.out.println(resultado.apply(8.9, 2.1));
		
		Function<Double, String> conceito = m -> (m>6) ? "aprovado": "reprovado";
		System.out.println(media.andThen(conceito).apply(7.0, 5.1));
		
		
		
		
	}

}
