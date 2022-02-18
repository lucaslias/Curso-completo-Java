package EstruturasDeControle;

import java.util.Scanner;

public class EstruturaWhile {
	
	public static void main(String[] args) {
		
		int contador = 1;
		
		//While determinado
		while(contador <= 5) {
			System.out.println("volta: "+ contador);
			contador++;
		}
		
		//While indeterminado
		Scanner ler = new Scanner(System.in);
		String valor = "";
		
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("palavra: ");
			valor = ler.nextLine();	
		}
		
	
		
		//Do While
		String texto ="";
		do {
			System.out.println("palavra: ");
			texto = ler.nextLine();	
		} while(!texto.equalsIgnoreCase("sair"));
		
		ler.close();
		
		
		
		
		
		
		
		
		
	}

}
