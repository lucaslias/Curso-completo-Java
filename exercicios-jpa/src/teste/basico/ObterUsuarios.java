package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //dentro dele tem a conex�o
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "select u from Usuario u";
//		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class); //consulta, a classe q ir� retornar
//		query.setMaxResults(5); //s� ira retornar 5 resultado no maximo
//		
//		List<Usuario> usuarios = query.getResultList();
		
		List<Usuario> usuarios = em
								.createQuery("select u from Usuario u", Usuario.class)
								.setMaxResults(5)
								.getResultList();
									
		for(Usuario usuario:usuarios) {
			System.out.println("ID:" + usuario.getId());
			System.out.println("Nome:" + usuario.getNome());
			System.out.println("Email:" + usuario.getEmail());
			System.out.println("--------------");
		}
		
		em.close();
		emf.close();
		
	}
	
}