package StreamAPI.Reduce;

public class MediaTeste {
	
	public static void main(String[] args) {
		
		Media m1 = new Media().adicionar(8.3d).adicionar(6.0d).adicionar(9.1d);
		Media m2 = new Media().adicionar(6.3d).adicionar(6.7d).adicionar(5.1d);
//		m1.adicionar(8.3d);
//		m1.adicionar(6.0d);
//		m1.adicionar(9.1d);
		
		System.out.println(Media.combinar(m1,m2).getValor());

	}

}
