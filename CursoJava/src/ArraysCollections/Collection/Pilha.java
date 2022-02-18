package ArraysCollections.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("1984");
		livros.push("O pequeno principe");
		livros.push("Harry Potter");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop()); //retorna erro igual o remove
		
		
	}
	
}
