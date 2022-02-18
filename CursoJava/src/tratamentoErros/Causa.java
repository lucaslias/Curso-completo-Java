package tratamentoErros;

public class Causa {
	
	public static void main(String[] args) {	
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) {
				System.out.println(e.getCause().getMessage());
			}
		}
		
		metodoB(null);
	}
	
	static void metodoA(Aluno aluno) {
		try {
			metodoB(aluno);
		} catch (Exception causa) {
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) {
		if(aluno == null) {
			throw new NullPointerException("aluno nulo");
		}

	}

}
