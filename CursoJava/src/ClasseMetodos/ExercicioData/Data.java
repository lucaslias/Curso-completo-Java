package ClasseMetodos.ExercicioData;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1901;
		this(1,1,1970); //chama o outro construtor passando os valores
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String obterDataFomatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirData() {
		System.out.println(obterDataFomatada());
	}

}
