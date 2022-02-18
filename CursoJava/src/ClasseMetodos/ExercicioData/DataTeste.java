package ClasseMetodos.ExercicioData;

public class DataTeste {

	
	public static void main(String[] args) {
		
		Data dataNasc = new Data(17,6,2000);
		//dataNasc.dia = 17;
		//dataNasc.mes = 06;
		//dataNasc.ano = 2000;
		System.out.println(dataNasc.obterDataFomatada());
		dataNasc.imprimirData();
		
		Data dataPadao = new Data();
		dataPadao.imprimirData();


	}
	


}
