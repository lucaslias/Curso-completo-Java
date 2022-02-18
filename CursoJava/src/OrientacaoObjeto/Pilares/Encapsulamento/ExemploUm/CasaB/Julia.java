package OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaB;

import OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaA.Ana;

public class Julia {
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		//System.out.println(esposa.segredo); -> não consegue acessar
		//System.out.println(mae.facoDentroDeCasa); -> outro pacote
		//System.out.println(mae.formaDeFalar);  -> não tem herança
		System.out.println(sogra.todosSabem); //é publico

	}

}
