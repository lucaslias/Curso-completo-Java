package ClasseMetodos.ExercicioProduto;

public class Produto {
	
	String nome;
	double preco;
	
	//static variavel agora pertence a classe e não a instancia
	static double desconto = 0.25;
	
	//construtor
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Igual ao construtor Default
	Produto(){
	}
	
	Double precoComDesconto() {
		return preco * (1-desconto);
	}
	
	Double precoComDesconto(double extra) {
		return preco * (1- (desconto+extra));
	}

}
