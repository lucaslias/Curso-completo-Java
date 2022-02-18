package Lambda.FuncaoPredicate;

import java.util.function.Predicate;

public class Predicado {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("notebook", 4000, 0.15);
		
		//Recebe um unico parametro e retorna true e false
		Predicate<Produto> isCaro = prod -> (prod.preco * (1-prod.desconto) >= 2000);
		
		System.out.println(isCaro.test(produto));
		
	}

}
