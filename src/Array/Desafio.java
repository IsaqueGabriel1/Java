package Array;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numeroNotas = 0;
		double soma = 0;
		double media = 0;
		
		//entrada: quantidade de notas
		System.out.printf("Quantas notas deseja informar:");
		numeroNotas = entrada.nextInt();
		
		double notasAluno[] = new double[numeroNotas];
		
		for(int i=0; i<notasAluno.length; i++) {
			//entrada:notas do aluno
			System.out.printf("\nDigite a %d do aluno: ", i+1);
			notasAluno[i] = entrada.nextDouble();
		}
		
		//System.out.println(Arrays.toString(notasAluno));
		
		for(double nota: notasAluno) {
			//processando notas
			soma += nota;
		}
		
		media = soma / notasAluno.length;
		//saida: media das notas
		System.out.println("A media das notas do aluno é: "+media);
		entrada.close();
	}
}
