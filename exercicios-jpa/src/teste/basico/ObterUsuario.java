package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conexão
		EntityManager em = emf.createEntityManager();
		
			//Consulta não precisa de transação
			Usuario usuario = em.find(Usuario.class, 2L);
			System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
		
	}
	
}
