package OrientacaoObjeto.Composicao.Desafio;

public class Principal {
	
	public static void main(String[] args) {
		
		Produto produto1 = new Produto("celular", 2499.99);
		Produto produto2 = new Produto("carregador", 100.00);
		Produto produto3 = new Produto("capinha", 44.99);
		Produto produto4 = new Produto("pelicula", 25.00);
		
		//Item item1 = new Item();
		//Item item2 = new Item();
		//Item item3 = new Item();
		//Item item4 = new Item();

		Compra compra1 = new Compra();
		Compra compra2 = new Compra();
		
		compra1.adicinarItemCompra(produto1,1);
		compra1.adicinarItemCompra(produto2,1);
		compra1.adicinarItemCompra(produto3,1);
		compra1.adicinarItemCompra(produto4,2);
		compra2.adicinarItemCompra(produto3,1);
		compra2.adicinarItemCompra(produto4,2);
		
		Cliente cliente1 = new Cliente("Lucas Guilherme");
		cliente1.adicinarCompraCliente(compra1);
		cliente1.adicinarCompraCliente(compra2);

		System.out.println("O cliente: " + cliente1.nome + " gastou: " + cliente1.totalGasto());
		System.out.println("com um total de: " + cliente1.quantidadeCompras() + " pedidos");
		System.out.println("e um ticket medio de: " + cliente1.mediaCompras());

	}

}
