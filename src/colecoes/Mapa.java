package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuario = new HashMap<>();
		//adiciona um registro
//		usuario.put(1, "Isaque");
		//altera o registro se existir
		usuario.put(1, "Ricardo");
		usuario.put(2, "Isa");
		usuario.put(3, "Mariana");
		usuario.put(4, "Arlete");
		
		System.out.println("Tamanho da collection:"+usuario.size());
		System.out.println("Está fazia?"+usuario.isEmpty());
		
		System.out.println("Chaves:"+usuario.keySet());
		System.out.println("Valor:"+usuario.values());
		System.out.println("Chave/valor:"+usuario.entrySet());
		System.out.println("Contem chave 4:"+usuario.containsKey(4));
		System.out.println("Contem valor Isa:"+usuario.containsValue("Isa"));
		
		System.out.println("Valor chave 4:"+usuario.get(4));
		System.out.println("\n");
//		for(int chave: usuario.keySet()) {
//			System.out.println("Chaves:"+chave);
//		}
//		for(String valor: usuario.values()) {
//			System.out.println("Valores:"+valor);
//		}
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.print(registro.getKey());
			System.out.print("=>"+registro.getValue()+"\n");
		}
	}
}
