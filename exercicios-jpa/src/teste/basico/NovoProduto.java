package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto produto = new Produto("celular", 2817.25);
		
		//dao.abrirT().incluir(produto).fecharT();
		
		dao.incluirAtomico(produto);

	}
	
	

}
