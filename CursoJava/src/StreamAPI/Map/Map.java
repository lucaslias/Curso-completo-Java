package StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
		
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		//marcas.stream().map( m-> m.toUpperCase()).forEach(System.out::print);
		
		marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra).map(Utilitarios.grito).forEach(print);
		

	}

}
