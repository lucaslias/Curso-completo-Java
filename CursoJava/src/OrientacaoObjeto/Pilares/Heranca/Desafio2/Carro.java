package OrientacaoObjeto.Pilares.Heranca.Desafio2;

public class Carro {
	
	int velocidadeAtual;
	int velocidadeMaxima;
	int delta = 5;
	
	Carro(int velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	void acelerar() {
		if (velocidadeAtual+delta > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		else {
			velocidadeAtual += delta;
		}

	}
	
	void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
		
	}
	

}
