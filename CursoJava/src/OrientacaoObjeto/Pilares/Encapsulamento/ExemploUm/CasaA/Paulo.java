package OrientacaoObjeto.Pilares.Encapsulamento.ExemploUm.CasaA;

public class Paulo {
	
	void testeAcessos() {
		
		Ana esposa = new Ana();
		//System.out.println(esposa.segredo); -> n�o consegue acessar
		System.out.println(esposa.facoDentroDeCasa); //mesmo pacote
		System.out.println(esposa.formaDeFalar);  //mesmo pacote
		System.out.println(esposa.todosSabem); //� publico

	}
	

}
