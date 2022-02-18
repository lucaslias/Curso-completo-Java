package Lambda.ForeachFuncional;

import java.util.ArrayList;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = new ArrayList<String>();
		aprovados.add("ana");
		aprovados.add("bia");
		aprovados.add("lia");
		aprovados.add("gui");
		
		for (String nome: aprovados){
			System.out.println(nome);
		}
		
		//----------------------------------------
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		//pra cada aprovado da lista de aprovados chame o system.out.println
		aprovados.forEach(System.out::println);
		
		aprovados.forEach(nome -> meuImprimir(nome));
		
		aprovados.forEach(Foreach::meuImprimir);
		
	}
		
	static void meuImprimir(String nome) {
		System.out.println("oi meu nome é:"  + nome);
			
	}

}
