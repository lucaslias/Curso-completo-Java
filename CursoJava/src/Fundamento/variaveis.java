package Fundamento;

public class variaveis {
	
	public static void main(String[] args) {
		
		
		//final o valor nunca será alterado, geralmente com letra maiuscula 
		final double PI = 3.1415;
		
		double raio = 3.4;
		double area = PI * raio * raio;
		System.out.println("Area: " + area);
		
		//pelo valor da variavel vai inferir o tipo
		var b = 4.5;
		System.out.println(b);
		
		/* 
		Tipo Primitivos
		- byte 
		- short 
		- int
		- long
		- double 
		- float
		- char
		- boolean
		 */
		
		//da para separar o numero por underline
		long varival = 1_000_000_000;
		System.out.println(varival);
		
		String s = "Boa Tarde";
		System.out.println(s.startsWith("Boa"));
		
		/*
		 charAt:  seleciona o caractere informado na posição
		 startsWitdh: retorna boolean (se inicia com o/os caracteres informados)
		 endsWitdh: retorna boolean (se termina com o/os caracteres informados)
		 toLowerCase: converte em letra minuscula
		 lenght: retorna o tamanho
		 equals: compara as strings
		 equalsIgnoreCase: compara sem considerar maiuscula e minuscula
		 contains: se tem o/os caracteres (retorna boolean)
		 */
		
		
		/* ----- Wrappers ------ 
		 	- "objetos" do tipo primitivo
			- Byte, Short, Integer, Long, Boolean, Charactere, Float
		*/
		Boolean bool = Boolean.parseBoolean("true");
		
		

		
		
		
		
		


		

		
		
		
		
		
		
	}

}
