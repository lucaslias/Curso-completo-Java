package Fundamento;

import java.util.Scanner;
/**
 * 
 * @author Usuário
 *
 */
public class PrimeiroPrograma {
	
	//tudo comeca no main
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("hello world");
		
		System.out.printf("teste: %d %d", 1,2);
		
		//receber texto do usuario
		System.out.println("digite seu nome:");	
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.nextLine();
		
		System.out.println("nome:" + nome);
		entrada.close();
		
		//JRE: usuario(machine para rodar o java)
		//JDK: DEV (ferramentas do kit java)
		//JVM :virtual machine
		
	}

}
