package OrientacaoObjeto.Pilares.Heranca.Desafio1;

public class Ferrari extends Carro{
	
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	

	public String toString() {
		return "Velocidade Atual ferrari: " + velocidadeAtual;
	}


}
