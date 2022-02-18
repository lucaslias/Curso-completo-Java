package OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes;

public class Heroi extends Jogador{
	
	//chama o construtor da classe pai
	//Como criou o construtor na classe pai � obrigado a criar na filho tamb�m 
	public Heroi(int x, int y){
		super(x,y);
	}
	
	@Override
	public boolean atacar(Jogador oponente) {
		
		//heroi ataca o dobro
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
	

}
