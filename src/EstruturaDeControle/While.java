package EstruturaDeControle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";
		
		
		while(!texto.equalsIgnoreCase("sair")) {
			System.out.print("Digite alguma coisa: ");
			texto = entrada.nextLine();
		}
		System.out.println("Fim do laço");
		
		entrada.close();
	} 
}
