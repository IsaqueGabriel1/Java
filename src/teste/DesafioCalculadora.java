package teste;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		String valor1 = teclado.next();
		
		System.out.print("\nDigite o segundo valor: ");
		String valor2 = teclado.next();
		
		System.out.print("\nDigite a operacao: ");
		String op = teclado.next();
		
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double res = op.equals("+") ? num1 + num2 : 
			op.equals("-") ? num1 - num2 :
				op.equals("*") ? num1 * num2 :
					op.equals("/") ? num1 / num2 :
						op.equals("%") ? num1 % num2 : 0;
		System.out.println(res);
	}
}
