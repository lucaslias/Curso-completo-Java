package OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaB;

import OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaA.Ana;

public class Julia {
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		//System.out.println(esposa.segredo); -> n�o consegue acessar
		//System.out.println(mae.facoDentroDeCasa); -> outro pacote
		//System.out.println(mae.formaDeFalar);  -> n�o tem heran�a
		System.out.println(sogra.todosSabem); //� publico

	}

}
