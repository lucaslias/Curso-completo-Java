package ClasseMetodos.ExercicioProduto;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//como é static pode alterar direto, sem criar a instancia
		Produto.desconto = 0.30;
		
		Produto p1 = new Produto("notebook", 4223.99);
		//p1.nome = "notebook";
		//p1.preco = 4223.99;
		//p1.desconto = 0.25;
		
		double precoFinal = p1.precoComDesconto();
		System.out.println(precoFinal);
		
		double precoFinal2 = p1.precoComDesconto(0.15);
		System.out.println(precoFinal2);
	}

}
