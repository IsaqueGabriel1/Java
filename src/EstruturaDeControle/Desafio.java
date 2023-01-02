package EstruturaDeControle;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaSemana = teclado.next();
		

		if(diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("\nDia 1");
		}else if(diaSemana.equalsIgnoreCase("terça")) {
			System.out.println("\nDia 2");
		}else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("\nDia 3");
		}else if(diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("\nDia 4");
		}else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("\nDia 5");
		}else if(diaSemana.equalsIgnoreCase("sabado")) {
			System.out.println("\nDia 6");
		}else if(diaSemana.equalsIgnoreCase("domingo")) {
			System.out.println("\nDia 7");
		}
		
		teclado.close();
	}
}

