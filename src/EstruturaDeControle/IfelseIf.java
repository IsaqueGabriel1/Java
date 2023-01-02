package EstruturaDeControle;

import java.util.Scanner;

public class IfelseIf {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota: ");
		double nota = entrada.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota invalida");
		}else {
			if(nota >= 8) {
				System.out.println("Nota A");
			}else if(nota >= 6) {
				System.out.println("Nota B");
			}else if(nota >= 4) {
				System.out.println("Nota C");
			}else {
				System.out.println("Nota D");
			}
		}
	}
}
