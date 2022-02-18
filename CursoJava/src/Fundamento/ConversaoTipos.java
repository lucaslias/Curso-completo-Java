package Fundamento;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConversaoTipos {
	
	public static void main(String[] args) {
	
	//conversao inplicita
	double a = 1;
	
	//conversão explicita(cast)
	float b = (float) 1.123;
	int c = (int) 5.999;
	
	
	Integer num = 1000;
	System.out.println(num.toString());
	
	
	String valor1 = JOptionPane.showInputDialog("digite o valor1");
	String valor2 = JOptionPane.showInputDialog("digite o valor2");
	double v1 = Double.parseDouble(valor1);
	double v2 = Double.parseDouble(valor2);
	double soma = v1 + v2;
	System.out.println(soma);
	
	//------------- Desafio Conversão -----------------
	
	Scanner ler = new Scanner(System.in);
		System.out.println("primeiro salario");
		String sal1 = ler.next().replace(",", ".");
		
		System.out.println("segundo salario");
		String sal2 = ler.next().replace(",", ".");
		
		double newSal1 = Double.parseDouble(sal1);
		double newSal2 = Double.parseDouble(sal2);
		
		double media = (newSal1 + newSal2)/2;
		System.out.println("media: " + media);
	
	
	ler.close();
	
	
	
	
		
	}
	

}
