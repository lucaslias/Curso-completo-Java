package Generics.exemplo2;

public class Caixa<E> { //pode usar qualquer coisa, até mesmo palavra
	
	private E coisa;
	
	public void guardar(E coisa) {
		this.coisa = coisa;
	}
	
	public E abrir(){
		return coisa;
	}
	

}
