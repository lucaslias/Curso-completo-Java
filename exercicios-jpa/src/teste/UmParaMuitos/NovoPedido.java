package teste.UmParaMuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umPraMuitos.ItemPedido;
import modelo.umPraMuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("cadeira", 300.00);
		Pedido pedido = new Pedido();
		
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();
	}

}
