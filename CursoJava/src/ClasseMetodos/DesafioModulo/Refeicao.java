package ClasseMetodos.DesafioModulo;

public class Refeicao {
	
	public static void main(String[] args) {
		
		Comida comida1 = new Comida("arroz", 1.5);
		Comida comida2 = new Comida("frango", 1.1);
		
		Pessoa pessoa = new Pessoa("Lucas", 70);
		
		pessoa.apresentar();
		
		pessoa.comer(comida1);
		pessoa.apresentar();
		
		
		pessoa.comer(comida2);
		pessoa.apresentar();
		
		
	}

}
