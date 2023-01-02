package EstruturaDeControle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String texto = "";
		
		do {
			System.out.println("Site as palavras magicas");
			System.out.printf("\nVc quer sair? ");
			texto = entrada.nextLine();
		}while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Saiu do limbo");
		entrada.close();
	}
}
