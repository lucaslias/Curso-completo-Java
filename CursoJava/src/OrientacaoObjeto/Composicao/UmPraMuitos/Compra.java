package OrientacaoObjeto.Composicao.UmPraMuitos;

import java.util.ArrayList;
import java.util.List;


//Uma compra tem varios itens
public class Compra {
	
	String cliente;
	List<Item> lista = new ArrayList<Item>();
	
	double getValorTotal() {
		double valor = 0;
			
		for(Item produto:lista) {
			valor += produto.preco * produto.quantidade;
		}

		return valor;
	}
	
	//Uma compra terá varios item, mas um item tem apenas uma compra
	void adicionarItem(Item item) {
		lista.add(item);
		item.compra = this;
	}
	
	

}
