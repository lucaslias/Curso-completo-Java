package tratamentoErros;

public class ChecadaVSnaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	//n�o checada ou n�o verificada(pode escolher ou n�o se quer tratar o erro
	static void geraErro1(){
		throw new RuntimeException("Ocorreu um erro bem legal");
	}
	
	//checada(� obrigado a colocar a assinatura do metodo)
	static void geraErro2() throws Exception{
		throw new Exception("Ocorreu um erro bem legal02");
	}

}
