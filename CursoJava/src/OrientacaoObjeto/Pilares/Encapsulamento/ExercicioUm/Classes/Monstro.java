package OrientacaoObjeto.Pilares.Encapsulamento.ExercicioUm.Classes;

public class Monstro extends Jogador{
	
	//seria a mesma coisa que o default, porem como no pai recebe x e y, � obrigatorio chamar o super passando as coordenadas
	public Monstro(){
		this(0,0);
	}
	
	//se for passado parametro ir� utilizar este, se n�o passar ira chamar o de cima que chama esse
	public Monstro(int x, int y){
		super(x,y);
	}

}
