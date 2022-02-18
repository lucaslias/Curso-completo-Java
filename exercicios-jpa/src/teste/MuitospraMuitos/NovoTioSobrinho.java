package teste.MuitospraMuitos;

import infra.DAO;
import modelo.MuitosPraMuitos.Sobrinho;
import modelo.MuitosPraMuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("maria");
		Tio tio2 = new Tio("joão");
		
		Sobrinho sobrinho1 = new Sobrinho("Davi");
		Sobrinho sobrinho2 = new Sobrinho("Ana");
		
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTio().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTio().add(tia1);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTio().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTio().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(tia1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinho2)
			.fecharT()
			.fechar();
		
		
	}
	
}
