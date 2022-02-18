package OrientacaoObjeto.Pilares.Heranca.Interface;

public class Ferrari extends Carro implements Esportivo, Luxo{
	
	private boolean ligarTurbo;
	private boolean ligarAR;
	
	protected Ferrari(){
		this(320);
	}
	
	protected Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setDelta(15);
	}

	public String toString() {
		return "Velocidade Atual ferrari: " + velocidadeAtual;
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}

	@Override
	public void ligarAr() {	
		ligarAR = true;
	}

	@Override
	public void desligarAr() {
		ligarAR = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAR) {
			return 35;
		}
		else if (ligarTurbo && ligarAR) {
			return 30;
		}
		else if (!ligarTurbo && !ligarAR) {
			return 20;
		}
		else {
			return 15;
		}
	}


}
