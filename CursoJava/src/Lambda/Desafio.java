package Lambda;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

import Lambda.FuncaoPredicate.Produto;

public class Desafio {

	public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
		
		Produto p = new Produto("ipad", 3235.89, 0.13);
		
		/*
		 * 1. A partir do produto calcular o preço real (com desconto)
		 * 2. Imposto municipal: >= 2500(8,5%) / <2500(isento)
		 * 3. Frete: >= 3000 (100) / <3000 (50)
		 * 4. Arredondar as casas decimais
		 * 5. Formatar: R$ 1234,56
		 */

		
		Function<Produto, Double> valor = num -> num.preco * (1- num.desconto);
		UnaryOperator<Double> precoImp = num -> num >= 2500 ? num * 1.085 : num ;
		UnaryOperator<Double> precoFret= num -> num >= 3000 ? num + 100 : num + 50 ;
		Function<Double, String> resultado =  num -> NumberFormat.getCurrencyInstance().format(num);

		System.out.println(valor.andThen(precoImp).andThen(precoFret).andThen(resultado).apply(p));
		
//		-----------------------------------------------------
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
	
		Produto p2 = new Produto("iPad", 3235.89, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p2);
		System.out.println("O preço final é " + preco);


		
		
	
		
		
	}
	
	
}
