package OrientacaoObjeto.Pilares.Heranca.Desafio2;

public class Ferrari extends Carro{
	
	Ferrari(){
		this(320);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	

//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	

	public String toString() {
		return "Velocidade Atual ferrari: " + velocidadeAtual;
	}


}
