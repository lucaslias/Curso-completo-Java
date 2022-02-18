package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conex�o
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("lucas guilherme");
		usuario.setEmail("lucasLias@email.com");
		
		//em.merge(usuario); mesmo n�o chamando o merge ele altera, pois est� dentro da transa��o e consequentemetne est� no status gerenciado
		//					se fizer alguma mudan�a altera no banco tamb�m 
		
		em.getTransaction().commit();
			
		
		
		em.close();
		emf.close();
	}
	
}
