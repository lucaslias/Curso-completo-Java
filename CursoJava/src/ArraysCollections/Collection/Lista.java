package ArraysCollections.Collection;

import java.util.ArrayList;
import java.util.List;


public class Lista {
	
	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>();
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Maria"));
		
		for(Usuario a:lista) {
			System.out.println(a.nome);
		}
		
		System.out.println(lista.get(1)); //acessa pelo index e pelo metodo toString
		
		lista.remove(1);
		lista.remove(new Usuario("Lucas"));
		
		System.out.println(lista.contains(new Usuario("Bia"))); //retorna true pq o equals está implementado
		
		
		
	}

}
