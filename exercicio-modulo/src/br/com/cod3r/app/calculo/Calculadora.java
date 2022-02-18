package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.logging.Logger;

public class Calculadora {

	private OperacoesAritimeticas opArit = new OperacoesAritimeticas();

	public double soma(Double... nums) {
		
		Logger.info("Somando...");
		return opArit.soma(nums);
	}
		
}
