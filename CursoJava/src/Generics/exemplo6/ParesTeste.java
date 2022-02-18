package Generics.exemplo6;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultado = new Pares<>();
		resultado.adicionar(1, "maria");
		resultado.adicionar(2, "joao");
		resultado.adicionar(2, "lucas");
		resultado.adicionar(3, "bia");
		
		System.out.println(resultado.getValor(1));
		System.out.println(resultado.getValor(2));
		System.out.println(resultado.getValor(3));
		
		
	}

}
