package ArraysCollections.Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetHomogeneo {
	
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<String>();
		Set<String> lista = new TreeSet<>(); //ordena em ordem alfabetica
		lista.add("Lucas");
		lista.add("Stark");
		lista.add("Carlos");
		lista.add("Pedro");
		
		
		for(String nome:lista) {
			System.out.println(nome);
		}
		
		
	}

}
