package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;

public class Teste {
	
	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2.0,3.0,4.0));
		
		OperacoesAritimeticas op = new OperacoesAritimeticas();
		System.out.println(op.soma(4.0,5.0,6.0));
		
	}

}
