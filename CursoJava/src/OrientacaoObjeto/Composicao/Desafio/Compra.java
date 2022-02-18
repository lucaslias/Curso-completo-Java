package OrientacaoObjeto.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	final List<Item> itens = new ArrayList<Item>();
	
	void adicinarItemCompra(Produto p, int quantidade) {
		this.itens.add(new Item(quantidade,p ));
	}
	
	Double valorTotalCompra() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.precoP;
		}
		return total;
		
	}

}
