package StreamAPI.Reduce;

public class Media {
	
	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) {
		total += valor;
		quantidade ++;
		return this;
	}
	
	public double getValor() {
		return total/quantidade;
	}
	
	public static Media combinar(Media... medias) {
		Media resultante = new Media();
		for(Media m:medias) {
			resultante.total += m.total;
			resultante.quantidade += m.quantidade;
		}
		return resultante;
	}
	

}
