package Generics.exemplo3;

public class CaixaIntTeste {
	
	public static void main(String[] args) {
		
//		CaixaInt<String> caixaA = new CaixaInt<>();
//		caixaA.guardar("sem definir o object na classe");
//		System.out.println(caixaA.abrir());
		
		CaixaInt caixaB = new CaixaInt();
		caixaB.guardar(123); //definiu integer na classe então irá aceitar somente int
		System.out.println(caixaB.abrir());
		
		
	}

}
