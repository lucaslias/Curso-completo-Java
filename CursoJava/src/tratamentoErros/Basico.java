package tratamentoErros;

public class Basico {
	
	public static void main(String[] args) {
		
		Aluno a1 =null;
		
		try {
			imprimirAluno(a1);
		} catch(Exception excecao) {
			System.out.println("ocorreu um erro ao imprimir");
		}
		
		try {
			System.out.println(7/0);
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("ocorreu o erro: " + e.getMessage());
		}
		
		
		System.out.println("fim :)");
		
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	

}
