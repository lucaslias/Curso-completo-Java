package OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaB;

import OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
		Ana mae = new Ana();
		//System.out.println(esposa.segredo); -> não consegue acessar
		//System.out.println(mae.facoDentroDeCasa); -> outro pacote
		//System.out.println(mae.formaDeFalar);  -> não da para acessar via instancia
		System.out.println(formaDeFalar); //acessa direto pois o pedro recebe a caracteristica
		System.out.println(mae.todosSabem); //é publico

	}

}
