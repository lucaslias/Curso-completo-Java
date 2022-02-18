package modelo.umPraMuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Long ID;
	
	@Column(nullable = false)
	private Date data;

	//carregameno tardio ou apressado
		//"manytoOne" ou "oneToOne" -> por parão é EAGER (jpa já traz de uma vez info das duas tabelas)
		//"...ToMany" -> por padrão é Lazy (traz de maneira tardia, se não usa com muita frequencia as duas informações melhor evitar alterar)
	@OneToMany(mappedBy = "pedido", fetch = FetchType.EAGER)
	private List<ItemPedido> itens;

	
	public Pedido() {
		this(new Date());
	}

	public Pedido(Date data) {
		super();
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
	
	
	
	

}
