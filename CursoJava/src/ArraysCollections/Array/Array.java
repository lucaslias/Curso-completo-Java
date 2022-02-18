package ArraysCollections.Array;

import java.util.Arrays;

public class Array {
	
	//tamanho estatico
	//Homogeneo
	//Estrutura indexada
	//int[]a = new int[6];
	//int[][] b = new int[3][3];
	
	public static void main(String[] args) {
		
		double[] notasAlunos = new double[3];
		notasAlunos[0]= 6.5;
		notasAlunos[1] = 8.8;
		notasAlunos[2]= 5.7;
		
		//--- Outra forma de declarar ---
		//double[] notaAlunob = {5.3,4.2,9.3, 8.4};
		
		//System.out.println(Arrays.toString(notasAlunos));
		
		double total = 0;
		for(int i=0; i<notasAlunos.length; i++) {
			total += notasAlunos[i];
		}
		
		total /= notasAlunos.length;
		
		System.out.println(total);
		
		
		
	}
	

}
