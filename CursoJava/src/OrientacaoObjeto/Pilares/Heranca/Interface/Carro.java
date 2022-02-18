package OrientacaoObjeto.Pilares.Heranca.Interface;

public class Carro {
	
	protected int velocidadeAtual;
	public final int velocidadeMaxima;
	private int delta = 5;
	
	Carro(int velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	void acelerar() {
		if (velocidadeAtual+ getDelta() > velocidadeMaxima) {
			velocidadeAtual = velocidadeMaxima;
		}
		else {
			velocidadeAtual += getDelta();
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
