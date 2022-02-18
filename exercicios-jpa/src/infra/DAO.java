package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import modelo.MuitosPraMuitos.Filme;

public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	//bloco estatico, isso será chamado apenas uma vez quando a classe for carregada
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		}catch(Exception e){
			// para não gerar grandes problemas
		}
	}
	
	public DAO() {
		this(null);
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	//metodos retornam o mesmo objeto permite encadear metodos
	public DAO<E> abrirT(){
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT(){
		em.getTransaction().commit();
		return this;
	}
	
	public DAO<E> incluir(E entidade){
		em.persist(entidade);
		return this;		
	}
	
	public void fechar() {
		em.close();
	}
	
	public DAO<E> incluirAtomico(E entidade){
		return this.abrirT().incluir(entidade).fecharT();		
	}
	public List<E> obterTodos(){
		//comeca do 0 e retorna os 10 primeiros
		return this.obterTodos(10,0);
	}
	
	public List<E> obterTodos(int qte, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("classe nula");
		}
		
		String jpql = "select e from " + classe.getName() + " e";
		//select e.* from nomeClasse e
		
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qte);
		query.setFirstResult(deslocamento);
		
		return query.getResultList();
	}
	
	public E obterPorId(Object id) {
		return this.em.find(classe, id);
	}
	


	public List<E> consultar(String nomeConsulta, Object... params){
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for(int i = 0; i<params.length; i+=2) {
			query.setParameter(params[i].toString(), params[i+1]);
		}
		
		
		return query.getResultList();
	}
	
	public E consultarUm(String nomeConsulta, Object... params){
		List<E> lista = consultar(nomeConsulta, params);
		
		
		return lista.isEmpty() ? null : lista.get(0);
	}


}