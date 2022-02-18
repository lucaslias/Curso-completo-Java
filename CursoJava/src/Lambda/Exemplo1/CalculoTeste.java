package Lambda.Exemplo1;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(1, 2));
		
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
		Calculo soma = (x,y) -> {return x + y;};
		System.out.println(soma.executar(3, 2));
		
		soma = (x,y) -> x + y;
		System.out.println(soma.executar(3, 2));
		
	}

}
