package Lambda.InterfaceFuncional;

//Só deixa colocar um metodo abstract
@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	
	default String teste() {
		return "teste";
	}
	
	static String teste2() {
		return "teste2";
	}

}
