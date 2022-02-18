package Lambda.FuncaoOperadorUnario;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	
	public static void main(String[] args) {
		

	//bom para encadeamento oq passa como � entrada � igual o gerado
	
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int resultado = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(3);
		
		//faz a ordem inversa
		int resultado2= aoQuadrado.compose(vezesDois).compose(maisDois).apply(3);
		
		System.out.println(resultado);
		System.out.println(resultado2);
		
		
	}
}
