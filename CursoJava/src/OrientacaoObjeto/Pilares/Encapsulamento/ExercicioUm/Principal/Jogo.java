package OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Principal;

import OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes.Heroi;
import OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes.Jogador;
import OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes.Monstro;

public class Jogo {
	
	/*
	 * Enum serve para uma quantidade definida de possibilidades
	 */

	public static void main(String[] args) {
		
		//duas formas de declarar
		Monstro monstro = new Monstro(); 
		Jogador heroi= new Heroi(10,11);	
		
		monstro.x = 10;
		monstro.y = 10;
		

		
		System.out.println("Vida Heroi: " + heroi.vida);
		System.out.println("vida monstro: " + monstro.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		//monstro tem menos vida porque heroi ataca 2 vezes
		System.out.println("Vida Heroi: " + heroi.vida);
		System.out.println("vida monstro: " + monstro.vida);
				

		
	}
}
