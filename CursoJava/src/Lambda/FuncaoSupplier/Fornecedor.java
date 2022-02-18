package Lambda.FuncaoSupplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	
	public static void main(String[] args) {
		
		//não recebe paremetro e retorna algo
		//Não tem composição 
		
			//O tipo de retorno será uma lista de strings
		Supplier<List<String>> umLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println(umLista.get());
		
			//retorna qualquer coisa(quanto mais especifico melhor)
		Supplier<Object> doisLista = () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		System.out.println(doisLista.get());
		
		
	}

}
