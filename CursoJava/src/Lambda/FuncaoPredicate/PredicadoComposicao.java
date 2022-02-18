package Lambda.FuncaoPredicate;

import java.util.function.Predicate;

public class PredicadoComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = num -> (num >= 100 & num <= 999);
		
		System.out.println(isPar.test(101));
		System.out.println(isTresDigitos.test(101));
		
		//false and  true = false
		System.out.println(isPar.and(isTresDigitos).test(101));
		
		//false or true = true
		System.out.println(isPar.or(isTresDigitos).test(101));
		
		//inverte o resultado
		System.out.println(isPar.or(isTresDigitos).negate().test(101));
		
		
		
	}

}
