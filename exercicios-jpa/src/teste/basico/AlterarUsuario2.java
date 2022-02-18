package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conexão
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("lucas guilherme");
		usuario.setEmail("lucasLias@email.com");
		
		//em.merge(usuario); mesmo não chamando o merge ele altera, pois está dentro da transação e consequentemetne está no status gerenciado
		//					se fizer alguma mudança altera no banco também 
		
		em.getTransaction().commit();
			
		
		
		em.close();
		emf.close();
	}
	
}
