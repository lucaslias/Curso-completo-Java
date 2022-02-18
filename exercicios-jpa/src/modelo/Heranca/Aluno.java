package modelo.Heranca;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //cria as duas tabelas

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE) //uma unica tabela com o campo definido no discriminator
	//@DiscriminatorColumn(name="tipo", length = 2, discriminatorType =  DiscriminatorType.STRING)
	//@DiscriminatorValue("AL")

@Inheritance(strategy = InheritanceType.JOINED) //cria duas tabelas e a relação entre elas
	@DiscriminatorColumn(name="tipo", length = 2, discriminatorType =  DiscriminatorType.STRING)
	@DiscriminatorValue("AL")

public class Aluno {
	
	@Id
	private Long matricula;
	private String nome;
	
	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(Long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	
	

}
