package OrientacaoObjeto.Pilares.Polimorfismo.Desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida ingred1 = new Arroz(0.2);
		Comida ingred2 = new Feijao(0.1);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingred1);
		convidado.comer(ingred2);
		
		Comida sobremesa = new Sorvete(0.4);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
		
		
		
	}

}
