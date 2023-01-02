package teste;

import java.util.Scanner;

public class StringParaNumero {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String valor1, valor2;
		
		System.out.println("Digite um numero");
		valor1  = teclado.next();
		
		System.out.println("Digite outro numero");
		valor2  = teclado.next();
		
		//System.out.println(valor1 + valor2);
		
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		double soma = numero1 + numero2;
		System.out.printf("Soma é " + soma);
		teclado.close();
	}
}
