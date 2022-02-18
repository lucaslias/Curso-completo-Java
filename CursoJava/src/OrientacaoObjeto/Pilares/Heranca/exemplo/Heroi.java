package OrientacaoObjeto.Pilares.Heranca.exemplo;

public class Heroi extends Jogador{
	
	//chama o construtor da classe pai
	//Como criou o construtor na classe pai é obrigado a criar na filho também 
	Heroi(int x, int y){
		super(x,y);
	}
	
	
	boolean atacar(Jogador oponente) {
		
		//heroi ataca o dobro
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
	

}
