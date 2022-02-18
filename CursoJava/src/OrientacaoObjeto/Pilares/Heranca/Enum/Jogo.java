package OrientacaoObjeto.Pilares.Heranca.Enum;

public class Jogo {
	
	/*
	 * Enum serve para uma quantidade definida de possibilidades
	 */

	public static void main(String[] args) {
		
		Jogador j1 = new Jogador();
		
		j1.x = 10;
		j1.y = 10;
		
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		
		System.out.println("x:" + j1.x + " / y:" + j1.y);
	}
}
