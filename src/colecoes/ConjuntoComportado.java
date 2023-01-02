package colecoes;

import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		//Essa lista será do tipo string
		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>();
		lista.add("Isaque");
		lista.add("Gabriel");
		lista.add("Eler");
		
		for(String nome: lista) {
			System.out.println(nome);
		}
	}
}
