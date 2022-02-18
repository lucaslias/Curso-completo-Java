package OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes;

public class Carro {
	
	protected int velocidadeAtual;
	public final int velocidadeMaxima;
	protected int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	
	public void acelerar() {
		if (velocidadeAtual+delta > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		else {
			velocidadeAtual += delta;
		}

	}
	
	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		}else {
			velocidadeAtual = 0;
		}
		
	}
	

}
