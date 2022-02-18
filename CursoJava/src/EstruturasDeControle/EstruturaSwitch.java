package EstruturasDeControle;

public class EstruturaSwitch {
	
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		//sem break(executa todos)
		switch(faixa){
			case "preta":
				System.out.println("ultima");
			case "branca":
				System.out.println("primeira");
			default:
				System.out.println("n�o sei");
		}
		
		
		//com break
		switch(faixa){
			case "preta":
				System.out.println("ultima");
				break;
			case "branca": case "amarela":
				System.out.println("primeira");
				break;
			default:
				System.out.println("n�o sei");
				//n�o coloquei o break porque j� � o ultimo
		}
		
		//break: quebra o fluxo natural e sai do la�o, usa no for/while tamb�m
			//break rotulado
			externo: for(int contador=0; contador<= 5; contador++) {
				for(int contador2=0; contador2<= 5; contador2++) {
					
					if (contador ==1) {
						break externo;
					}
					
				}
			}
		
		
		//continue: interrompe apenas aquela repeti��o(a volta)
			//continue rotulado
			externo: for(int contador=0; contador<= 5; contador++) {
				for(int contador2=0; contador2<= 5; contador2++) {
					
					if (contador ==1) {
						continue externo;
					}
					
				}
			}
			
		
	}

}
