package Generics.exemplo2;

public class CaixaTeste {
	
	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>(); //passando o tipo evita o problema com o cast
		caixaA.guardar("ola");	
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>(); 
		caixaB.guardar(3.1415);	
		System.out.println(caixaB.abrir());
		
		
	}

}
