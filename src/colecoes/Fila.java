package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//Offer e add -> Adicionam elementos na fila
		//diferença é o comportamento quando a fila está cheia
		fila.add("Ana");//retorna uma exceção se estiver cheio
		fila.offer("Bia");
		fila.add("Daniel");
		fila.offer("Carlos");
		fila.add("Rafael");
		fila.add("Gui");
		
		//Diferença é o comportamento ocrre
		//quando está vazia
		//obter o proximo elemento da fila
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element());//lança uma exceção
		
//		fila.clear();
//		fila.size();
//		fila.isEmpty();
		System.out.println("Comando POLL");
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
//		fila.clear();
//		fila.size();
//		fila.isEmpty();
//		fila.contains()
	}
}
