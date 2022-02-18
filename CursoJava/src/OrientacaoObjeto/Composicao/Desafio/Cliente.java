package OrientacaoObjeto.Composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	
	void adicinarCompraCliente(Compra compra) {		
		compras.add(compra)	;
	}
	
	double totalGasto() {
		double total = 0;
		for(Compra compra: compras) {
			total += compra.valorTotalCompra();
		}
		return total;
	}
	
	
	int quantidadeCompras() {
		return compras.size();
	}
	
	double mediaCompras() {		
		return totalGasto()/quantidadeCompras() ;
	}
	
	
	

}

