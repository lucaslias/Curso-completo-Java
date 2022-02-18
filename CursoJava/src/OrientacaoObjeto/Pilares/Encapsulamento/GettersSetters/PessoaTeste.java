package OrientacaoObjeto.Pilares.Encapsulamento.GettersSetters;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		
		//p1.idade = 30;
		//System.out.println(p1.idade);
		
		p1.setIdade(21);
		p1.setNome("Lucas");
		System.out.println(p1.getIdade());
		
		System.out.println(p1.getNomeIdade());
	}

}
