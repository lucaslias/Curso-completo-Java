package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conexão
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("lucas guilherme");
		
		em.detach(usuario); //tirar do estado gerenciado

		em.getTransaction().commit();	
		
		em.close();
		emf.close();
	}
	
}
