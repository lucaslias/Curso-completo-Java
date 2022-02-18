package br.com.empresa.exerciciossb.model.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class ItensPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ped;
	
	private String nome;
	
	private double preco;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Pedido pedido;

	public ItensPedido() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ItensPedido(String nome, double preco, Pedido pedido) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.pedido = pedido;
	}

	public int getId_ped() {
		return id_ped;
	}

	public void setId_ped(int id_ped) {
		this.id_ped = id_ped;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
	
	
	
	

}
