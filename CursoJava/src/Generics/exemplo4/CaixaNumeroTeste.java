package Generics.exemplo4;

public class CaixaNumeroTeste {
	
	public static void main(String[] args) {
		
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(123);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(12.456);
		System.out.println(caixaB.abrir());
		
		
		
	}

}
