package teste.umParaUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class ObterClienteAssento {
	public static void main(String[] args) {
		
		//Assento assento = new Assento("4D");
		//Cliente cliente = new Cliente ("Lucas",assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		Cliente cliente =  dao.obterPorId(1L);
			System.out.println(cliente.getAssento().getNome());
		
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(1L);
		System.out.println(assento.getCliente().getNome());

		dao.fechar();
		
	}
	
}
