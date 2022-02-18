package ArraysCollections.Collection;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		fila.add("Lucas"); //caso n�o conseguir adicionar retorna erro
		fila.offer("Maria"); //caso n�o conseguir adicionar retorna falso
		fila.offer("Jo�o"); 
		fila.offer("Strak"); 
		
		System.out.println(fila.peek()); //pega o primeiro(mas n�o remove), se n�o tiver nada retorna null
		System.out.println(fila.element()); //pega o primeiro(mas n�o remove), se n�o tiver nada retorna erro
			
		System.out.println(fila.poll()); //pega o proximo da fila e remove, se n�o tiver mais nada retorna null
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		System.out.println(fila.remove());//mesma coisa que o pool, por�m remove retorna erro quando n�o tem mais nada
		
		
		fila.clear();
		
	}

}
