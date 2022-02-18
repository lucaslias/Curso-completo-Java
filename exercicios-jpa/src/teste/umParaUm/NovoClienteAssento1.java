package teste.umParaUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		
		Assento assento = new Assento("1F");
		Cliente cliente = new Cliente ("Lucas",assento);
		
		DAO<Object> dao = new DAO<>();
		
		//tem q inserir primeiro o id do assento para quando for inseirir o cliente já existir o id, se inverter também funciona 
			//(mas tem que ser na mesma transacao)
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
		
	}
	
}
