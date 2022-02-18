package OrientacaoObjeto.Composicao.UmPraMuitos;

public class CompraTeste {
	
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "Lucas";
		//compra1.lista.add(new Item("caneta", 20, 3.50));
		//compra1.lista.add(new Item("lapis", 5, 2.00));
		//compra1.lista.add(new Item("caderno", 2, 13.50));
		
		compra1.adicionarItem(new Item("caneta", 20, 3.50));
		compra1.adicionarItem(new Item("lapis", 5, 2.00));
		compra1.adicionarItem(new Item("caderno", 2, 13.50));
		
		System.out.println(compra1.getValorTotal());
		
	}

}
