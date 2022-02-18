package br.com.empresa.exerciciossb.model.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String tipo;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
		@JoinColumn(name = "pedido_id")
	private List<ItensPedido> itensPedido;

	public Pedido() {
	}

	public Pedido(String tipo, List<ItensPedido> itensPedido) {
		super();
		this.tipo = tipo;
		this.itensPedido = itensPedido;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<ItensPedido> getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(List<ItensPedido> itensPedido) {
		this.itensPedido = itensPedido;
	}
	
	
	
	

}
