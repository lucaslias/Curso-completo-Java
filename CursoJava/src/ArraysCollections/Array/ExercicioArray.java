package ArraysCollections.Array;

import java.util.Scanner;

public class ExercicioArray {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("digite a quantidade de nota:");
		int quant = ler.nextInt();
		
		double[] notas = new double[quant];
		
		for (int i=0; i< notas.length; i++) {
			System.out.println("digite a "+ (i+1) + " nota:");
			notas[i] = ler.nextDouble();
		}

		ler.close();
		
		int total=0;
		for(double nota:notas) {
			total += nota;
		}
		
		total /= notas.length;
	
		System.out.println(total);
		
		
		
	}

}
