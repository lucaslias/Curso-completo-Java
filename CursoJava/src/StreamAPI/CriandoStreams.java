package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "js ", "asp \n");
		langs.forEach(print);
		
		String[] maisLangs = {"SPRING ", "ANGULAR ", "REACT \n"};
		
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs,1,2).forEach(print); //do indice 1 até o 2 sem pegar o 2
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "KOTLIN \n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		//---------- Streams infinitas 
		//Stream.generate( () -> "a").forEach(print);
		//Stream.iterate(0, n -> n+1).forEach(print);
		
		
		
	}

}
