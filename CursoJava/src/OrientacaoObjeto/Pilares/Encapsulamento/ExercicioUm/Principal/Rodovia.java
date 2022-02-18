package OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Principal;

import OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes.Carro;
import OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes.Ferrari;
import OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes.Fusca;

public class Rodovia {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Ferrari(); //pode ou não passar a velocidade maxima pois tem os 2 construtores
		
		
		carro1.acelerar();
		System.out.println(carro1);
		carro1.acelerar();
		System.out.println(carro1);
		carro1.acelerar();
		System.out.println(carro1);
		carro1.frear();
		System.out.println(carro1);

		
		System.out.println("-------------------------------------------------");
		
		Carro carro2 = new Fusca(); //a velocidade maxima está definida no construtor da classe Fusca
		
		carro2.acelerar();
		System.out.println(carro2);
		carro2.acelerar();
		System.out.println(carro2);
		carro2.acelerar();
		System.out.println(carro2);
		carro2.frear();
		System.out.println(carro2);
		
	}

}
