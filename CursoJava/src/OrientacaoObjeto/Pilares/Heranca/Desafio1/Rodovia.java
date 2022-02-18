package OrientacaoObjeto.Pilares.Heranca.Desafio1;

public class Rodovia {
	
	public static void main(String[] args) {
		
		Carro carro1 = new Ferrari();
		carro1.acelerar();
		System.out.println(carro1);
		carro1.acelerar();
		System.out.println(carro1);
		carro1.acelerar();
		System.out.println(carro1);
		carro1.frear();
		System.out.println(carro1);

		
		System.out.println("-------------------------------------------------");
		
		Carro carro2 = new Fusca();
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
