package Array;

import java.util.Iterator;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos: ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno?");
		int qntNotas = entrada.nextInt();
		
		double [][] notasDaTurma = new double[qtdAlunos][qntNotas];
		double total=0;
		for(int a=0; a<notasDaTurma.length; a++) {
			for(int n=0; n<notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d:", n, a);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total  / (qtdAlunos * qntNotas);
		System.out.println("Media da turma é " + media);
		entrada.close();
	}
}
