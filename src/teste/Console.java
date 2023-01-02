package teste;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//captura uma string digitada no teclado
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobreNome = entrada.nextLine();
		
		//captura um inteiro
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("O usuario se chama %s %s\ntem %d anos", nome, sobreNome, idade);
	
		entrada.close();
	}
}
