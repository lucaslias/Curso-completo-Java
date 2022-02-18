package tratamentoErros.personalizadaB;

@SuppressWarnings("serial") //colocar objeto java em um "texto"
public class NumeroInvalidoException extends Exception{
	
	private String nomeDoAtributo;
	
	public NumeroInvalidoException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;	
	}
	
	@Override
	public String getMessage() {
		return String.format("O atributo %s está invalido", nomeDoAtributo);

	}
	
}
