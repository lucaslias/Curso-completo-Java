package OrientacaoObjeto.Pilares.Encapsulamento.GettersSetters;

public class Pessoa {
	
	private int idade;
	private String nome;
	
	public Pessoa() {
		this(0);
	}
	
	public Pessoa(int idade) {
		setIdade(idade);
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade); //transfora o negativo em positivo
		if(idade>=0 && idade<110) {
			this.idade = idade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//Posso criar um metodo calculado
	public String getNomeIdade(){
		return getNome() + " -> " + getIdade();
	}
	
	
	
	

}
