package Generics.exemplo5;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("js", "java", "php", "c++");
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
		
		String ultimoLangs = (String) ListaUtil.getUltimo1(langs);
		Integer ultimoNums = (Integer) ListaUtil.getUltimo1(nums);
		
		String ultimoLangs2 = ListaUtil.getUltimo2(langs); //se passou um lista de String, sabe que irá retornar uma String
		Integer ultimoNums2 =  ListaUtil.getUltimo2(nums);
		
		
		
	}

}
