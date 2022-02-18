package ArraysCollections.Collection;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Lucas");
		usuarios.put(25, "João");
		usuarios.put(3, "Maria");
		
		usuarios.put(1, "Lucas Guilherme"); //substitui o nome anterior
		
		System.out.println(usuarios.keySet());//retorna todas as chaves
		System.out.println(usuarios.values());//retorna somente valor
		System.out.println(usuarios.entrySet());//retorna a chave e valor
		
		System.out.println(usuarios.containsKey(25));//se existe a chave
		System.out.println(usuarios.containsValue("Maria"));//se existe o valor
		
		System.out.println(usuarios.get(25));//valor da chave informada
		
		for (int chave: usuarios.keySet()){
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()){
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro:usuarios.entrySet()) {
			System.out.println( registro.getKey() + " -> " + registro.getValue());
		}
		
		
		
		

	}
}
