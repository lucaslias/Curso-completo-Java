package ArraysCollections.Array;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		System.out.println("digite a quantidade de Aluno:");
		int quantA = ler.nextInt();
		
		System.out.println("digite a quantidade de Notas:");
		int quantN = ler.nextInt();
		
		double[][] notas = new double[quantA][quantN];
		double total=0;
		
		for(int a = 0; a < notas.length; a++ ) {
			for(int n = 0; n < notas[a].length; n++ ) {
				System.out.println("digite a nota "+ (n+1) + " do aluno "+ (a+1));
				notas[a][n] = ler.nextDouble();
				total += notas[a][n];
			}	
		}
		
		
		double media = total/(quantA*quantN);
		System.out.println(media);
		
		
		ler.close();
		
		
		
		
		
	}

}
