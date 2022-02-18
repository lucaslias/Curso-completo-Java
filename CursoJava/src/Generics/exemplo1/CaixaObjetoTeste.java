package Generics.exemplo1;

public class CaixaObjetoTeste {  
	
	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //double -> Double
		
		// ---- da erro ---------
		//Integer coisa = (Integer) caixaA.abrir();
		//System.out.println(coisa);
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ola"); 
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
		
	}

}