package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conexão
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("lucas guilherme");
		usuario.setEmail("lucasLias@email.com");
		
		em.merge(usuario); //persiste alterando
		
		em.getTransaction().commit();
			
		
		
		em.close();
		emf.close();
	}

}
