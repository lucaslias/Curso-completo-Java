package OrientacaoObjeto.Composicao.UmPraUm;

public class Motor {
	
	final Carro carro;
	
	double fatorInjecao = 1;
	boolean ligado = false;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		
		//return (!ligado ? 0 : (int) Math.round(fatorInjecao * 3000));
		
		if(!ligado) {
			return 0;
		}
		else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
