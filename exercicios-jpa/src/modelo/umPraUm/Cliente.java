package modelo.umPraUm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import javax.persistence.CascadeType;

@Entity
@Table(name = "Clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String nome;
	
	//é mais comum a partir do aluno identificar o aluno
	@OneToOne(cascade = CascadeType.PERSIST) //quando persistir o clinte também persiste o assento
	@JoinColumn(name = "assento_id", unique = true) //campo para junção de tabelas 
	private Assento assento;

	public Cliente() {
	}
	
	public Cliente(String nome, Assento assento) {
		super();
		this.nome = nome;
		this.assento = assento;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	
	
	
	
	
	
	
	
}