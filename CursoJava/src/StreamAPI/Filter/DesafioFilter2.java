package StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {
	
	/* mostrar todos o produtos que estão com desconto >30%
	 *  e produos que tem frete gratis
	 */
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("tenis", 700.00, 0.31, true);
		Produto p2 = new Produto("celular", 1700.00, 0.31, false);
		Produto p3 = new Produto("notebook", 2700.00, 0.30, true);
		Produto p4 = new Produto("tv", 3700.00, 0.30, false);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4);
		
		Predicate<Produto> desconto = a -> a.desconto > 0.3;
		Predicate<Produto> frete = a -> a.freteGratis == true;
		Function<Produto, String> texto = a -> "Super promocão " + a.nome + " produto com mais de 30% de desconto e frete gratis";
		
		produtos.stream()
			.filter(desconto)
			.filter(frete)
			.map(texto)
			.forEach(System.out::println);
			
	}

}
