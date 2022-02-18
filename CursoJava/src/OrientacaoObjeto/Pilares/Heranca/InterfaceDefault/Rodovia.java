package OrientacaoObjeto.Pilares.Heranca.InterfaceDefault;

public class Rodovia {
	
	public static void main(String[] args) {
		
		Ferrari carro1 = new Ferrari(); //pode ou não passar a velocidade maxima pois tem os 2 construtores
		carro1.velocidadeAtual = 260;
		
		
		carro1.acelerar();
		System.out.println(carro1);
		carro1.acelerar();
		System.out.println(carro1);
		carro1.acelerar();
		System.out.println(carro1);
		
		carro1.ligarTurbo();
		carro1.acelerar();
		System.out.println(carro1);
		
		carro1.desligarTurbo();
		carro1.acelerar();
		System.out.println(carro1);

		carro1.frear();
		System.out.println(carro1);

		
		System.out.println("-------------------------------------------------");
		
		Carro carro2 = new Fusca(); //a velocidade maxima está definida no construtor da classe Fusca
		carro2.velocidadeAtual = 190;
		
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
