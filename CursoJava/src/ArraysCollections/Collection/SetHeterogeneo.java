package ArraysCollections.Collection;

import java.util.HashSet;

public class SetHeterogeneo {
	
	//é um conjunto, boa pratica: homogeneo, não aceita duplicados, não indexado
	
	@SuppressWarnings({ "rawtypes", "unchecked" })//para parar de dar o warnin
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add("teste"); //não aceita duplica
		
		System.out.println("tamanho: " + conjunto.size());
		
		System.out.println(conjunto.remove(1.2));
		System.out.println("tamanho: " + conjunto.size());
		
		System.out.println(conjunto.contains("teste"));
		
		
		HashSet nums = new HashSet();
		nums.add(1);
		nums.add(1);
		nums.add(1);
		conjunto.addAll(nums);//união de conjuntos
		conjunto.retainAll(conjunto);//intersecção de conjuntos
		
		conjunto.clear();
		
		
		
		
		
	}

}
