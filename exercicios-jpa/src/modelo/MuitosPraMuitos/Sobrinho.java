package modelo.MuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Sobrinho {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String nome;
	
	@ManyToMany(mappedBy = "sobrinhos") //será tio_sobrinho pois se aqui está mapeado, a principal é a outra
	private List<Tio> tio = new ArrayList<>();
	
	public Sobrinho() {

	}

	public Sobrinho(String nome) {
		super();
		this.nome = nome;
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

	public List<Tio> getTio() {
		return tio;
	}

	public void setTio(List<Tio> tio) {
		this.tio = tio;
	}
	
	
	
	

}
