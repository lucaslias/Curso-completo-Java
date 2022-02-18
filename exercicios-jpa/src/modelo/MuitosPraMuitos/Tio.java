package modelo.MuitosPraMuitos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tio {
	
	//A tabela intermediaria terá o nome iniciando com o nome da relação principal
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	private String nome;
	
	@ManyToMany
	private List<Sobrinho> sobrinhos = new ArrayList<>();;
	

	public Tio() {
	}

	public Tio(String nome) {
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

	public List<Sobrinho> getSobrinhos() {
		return sobrinhos;
	}

	public void setSobrinhos(List<Sobrinho> sobrinhos) {
		this.sobrinhos = sobrinhos;
	}
	
	


}
