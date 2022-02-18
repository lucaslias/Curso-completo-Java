package Lambda.FuncaoConsume;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import Lambda.FuncaoPredicate.Produto;

public class Consumidor {

	public static void main(String[] args) {
		
		Produto produto1= new Produto("notebook", 4000, 0.15);
		Produto produto2 = new Produto("celular", 3000, 0.15);
		Produto produto3 = new Produto("caderno", 40, 0.15);
		Produto produto4 = new Produto("caneta", 4, 0.15);
		
		//Recebe um unico parametro e não retorna nada
		Consumer<Produto> imprimir = p -> System.out.println(p.nome);
		
		imprimir.accept(produto1);
//		
//		List<Produto> produto = Arrays.asList(produto1, produto2, produto3, produto4);
//		produto.forEach(imprimir);
//		produto.forEach(p -> System.out.println(p.nome));
//		produto.forEach(System.out::println);
		
		
	}
	
}
