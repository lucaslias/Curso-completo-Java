package tratamentoErros.personalizadaA;

import tratamentoErros.Aluno;

public class TesteValidacao {
	
	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("aaa", -7);
			Validar.aluno(aluno);
		} catch (StringVaziaException | NumeroInvalidoException e) {
			System.out.println(e.getMessage());
		} 
		
		System.out.println("fim");
		
	}

}
