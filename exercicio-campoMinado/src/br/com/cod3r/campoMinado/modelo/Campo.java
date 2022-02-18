package br.com.cod3r.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.cod3r.campoMinado.excecao.ExplosaoException;

public class Campo {

	private final int linha;
	private final int coluna;
		
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
		
	private List<Campo> vizinhos = new ArrayList<>();
		
	Campo(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
	}
		
	boolean adicionarVizinho(Campo vizinho) {
		boolean linhaDiferente = linha != vizinho.linha;
		boolean colunaDiferente = coluna != vizinho.coluna;
		boolean diagonal = linhaDiferente && colunaDiferente;
			
		int deltaLinha = Math.abs(linha - vizinho.linha);
		int deltaColuna = Math.abs(coluna - vizinho.coluna);
		int detalGeral = deltaColuna + deltaLinha;
			
		if(detalGeral == 1 && !diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else if(detalGeral == 2 && diagonal) {
			vizinhos.add(vizinho);
			return true;
		} else {
			return false;
		}
	}
	
	void alternarMacacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}	
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(v-> v.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(v-> v.minado);
		
	}
	
	void minar() {
		minado = true;
	}
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	
	boolean isMarcado() {
		return marcado;
	}
	
	boolean isAberto() {
		return aberto;
	}
	
	boolean isMinado() {
		return minado;
	}

	public int getLinha() {
		return linha;
	}

	public int getColuna() {
		return coluna;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	long MinasNaVizinhanca() {
		return vizinhos.stream().filter(v-> v.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
	}
	
	@Override
	public String toString() {
		if(marcado) {
			return "x";
		} else if (aberto && minado) {
			return "*";
		} else if (aberto && MinasNaVizinhanca() > 0) {
			return Long.toString(MinasNaVizinhanca());
		} else if(aberto) {
			return " ";
		} else {
			return "?";
		}
	}
	
	
	
	
		

}
