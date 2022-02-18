package ArraysCollections.EqualsHashCode;

public class Equals {
	
	public static void main(String[] args) {
		
		/*
		 * - 1 == 1 => true
		 * Produto p1 = new Produto("café")
		 * Produto p2 = new Produto("cafe")
		 * - p1 == p2 => false
		 * - p1.equals(p2) => false (funciona igual o "==", olha o endereço de memoria)
		 * - Tem que definir e implementar o objeto para comparar corretamente
		 */
		
		/*
		 * - equals
		 * 		retorna true ou false
		 * 
		 * - hashcode 
		 * 		retorna valor inteiro  
		 * 		Metodo mais rapido que o equals, seleciona os valores que possivelmente podem ser iguais para depois usar o equals(que é mais lento)
		 */
		
		Usuario u1 = new Usuario();
		u1.nome = "Lucas Guilherme";
		u1.email = "Lucas@email.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Lucas Guilherme";
		u2.email = "Lucas@email.com";
		
		System.out.println(u1 == u2); //false
		System.out.println(u1.equals(u2)); //depois de implementar retorna true
		
		
		
		
		
	}

}
