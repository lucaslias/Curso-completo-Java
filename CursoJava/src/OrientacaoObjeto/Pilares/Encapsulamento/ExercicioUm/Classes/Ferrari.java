package OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes;

public class Ferrari extends Carro{
	
	public Ferrari(){
		this(320);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	

//****** Se tentar sobrescrever um metodo nunca pode diminuir a visibilidade ********
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
	

	public String toString() {
		return "Velocidade Atual ferrari: " + velocidadeAtual;
	}


}
