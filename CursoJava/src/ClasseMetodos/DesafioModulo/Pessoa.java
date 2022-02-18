package ClasseMetodos.DesafioModulo;

public class Pessoa {

	String nomeP;
	double pesoP;;
	
	Pessoa (String nomeP, double pesoP){
		this.nomeP = nomeP;
		this.pesoP = pesoP;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			pesoP += comida.caloriaC;
			System.out.println("Comendo ....");
		}
	}
	
	void apresentar() {
		System.out.println("Lucas pesa:" + pesoP);	
	}
	
	
}
