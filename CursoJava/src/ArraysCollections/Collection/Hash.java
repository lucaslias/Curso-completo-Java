package ArraysCollections.Collection;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("Lucas"));
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Maria"));
		
		System.out.println(usuarios.contains(new Usuario("Lucas")));
		
		
		
	}

}
