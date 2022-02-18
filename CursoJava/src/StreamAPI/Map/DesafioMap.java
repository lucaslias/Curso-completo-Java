package StreamAPI.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		UnaryOperator<String> inverter = n -> new StringBuilder(n).reverse().toString();
		
		Function<String, Integer> binarioParaInt = s-> Integer.parseInt(s,2);
		
		//1. transformar numero em sring binaria
		//2. Inverter a string
		//3. convertyer para inteiro
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
	}

}
