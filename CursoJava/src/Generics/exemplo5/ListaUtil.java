package Generics.exemplo5;

import java.util.List;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) { //a lista irá aceitar qualquer coisa. mas é diferente de definir q quer object
		
		return lista.get(lista.size() - 1);
	}
	
	
	public static <T> T getUltimo2(List<T> lista) { //retorna o tipo da lista
		
		return lista.get(lista.size() - 1);
	}
	

}
