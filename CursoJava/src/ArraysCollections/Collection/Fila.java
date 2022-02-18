package ArraysCollections.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Lucas"); //caso não conseguir adicionar retorna erro
		fila.offer("Maria"); //caso não conseguir adicionar retorna falso
		fila.offer("João"); 
		fila.offer("Strak"); 
		
		System.out.println(fila.peek()); //pega o primeiro(mas não remove), se não tiver nada retorna null
		System.out.println(fila.element()); //pega o primeiro(mas não remove), se não tiver nada retorna erro
			
		System.out.println(fila.poll()); //pega o proximo da fila e remove, se não tiver mais nada retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.remove());//mesma coisa que o pool, porém remove retorna erro quando não tem mais nada
		
		
		fila.clear();
		
	}

}
