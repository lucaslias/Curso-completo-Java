module exercicio.modulo {
//open module exercicio.modulo { //permitir acessar a classe e alterar os atributos
	
	//*** EVITAR DEPENDENCIA CICLICA "a -> b -> c -> a"
	
	//requires transitive exercicio.modulo3; //fica visivel para o outro projeo q utiliza o modulo de calculo
	requires exercicio.modulo3; 
	exports br.com.cod3r.app.calculo; //fica visivel para outros projetos
	
	exports br.com.cod3r.app.calculo.interno //exporta somente para ele
		to exercicio.modulo2;
	
	//opens br.com.cod3r.app.calculo to exercicio.modulo3, exercicio.modulo2; //permite apenas este modulo alterar algo
	
	
	
}