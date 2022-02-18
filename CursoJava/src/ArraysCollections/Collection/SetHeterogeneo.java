package ArraysCollections.Collection;

import java.util.HashSet;

public class SetHeterogeneo {
	
	//� um conjunto, boa pratica: homogeneo, n�o aceita duplicados, n�o indexado
	
	@SuppressWarnings({ "rawtypes", "unchecked" })//para parar de dar o warnin
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add("teste"); //n�o aceita duplica
		
		System.out.println("tamanho: " + conjunto.size());
		
		System.out.println(conjunto.remove(1.2));
		System.out.println("tamanho: " + conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		
		
		HashSet nums = new HashSet();
		nums.add(1);
		nums.add(1);
		nums.add(1);
		conjunto.addAll(nums);//uni�o de conjuntos
		conjunto.retainAll(conjunto);//intersec��o de conjuntos
		
		conjunto.clear();
		
		
		
		
		
	}

}
