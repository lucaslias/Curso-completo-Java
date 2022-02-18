package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		//entity manager : gerente das entidades(mapeadas) -> insere, altera, deleta as entidades/representa também a conexao
		//entity manager : criar o entity manager
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conexão
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("LucasTeste", "LucasTeste@email.com");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("o ID do novo usuario foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();
		
		
		
		
	}

}
