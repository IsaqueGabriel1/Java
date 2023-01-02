package EstruturaDeControle;

import java.util.Scanner;

public class ExerWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor = 0;
		double soma = 0;
		double media = 0;
		int cont = 0;
		
		System.out.println("------------------------------------------------------");
		System.out.println("Bem vindo ao calculador de media do Isaias");
		System.out.println("Formula da media = soma das notas / quantidade notas");
		System.out.println("Digite -1 para sair");
		System.out.println("------------------------------------------------------");
		
		while(valor != -1) {
			System.out.print("Digite uma nota: ");
			valor = entrada.nextDouble();
			if(valor != -1) {
				if(valor > 10 || valor < 0) {
					System.out.println("Digite uma nota valida");
				}else {
					soma = soma + valor;
					cont++;
				}
			}
		}
		
		media = soma / cont;
		System.out.printf("A media do aluno é: %.2f", media);
		entrada.close();
	}
}
