package teste.umParaUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente ("Lucas",assento);
		
		DAO<Object> dao = new DAO<>();
		dao.incluirAtomico(cliente);
		
	}
	
}
