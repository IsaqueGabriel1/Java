package EstruturaDeControle;

import java.util.Scanner;

public class ConsolidarEstudos {
	public static void main(String[] args) {
	
		int contador=1;
		double nota=0, media=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.printf("Digite a quantidade de notas que deseja inserir no sistema: ");
		int qntNotas = teclado.nextInt();
		
		while(contador <= qntNotas) {
			System.out.printf("Digite a nota: ");
			nota+= teclado.nextDouble();
			media = nota / qntNotas;
			contador++;
		}
		System.out.printf("A media é %.2f", media);
	}
}
