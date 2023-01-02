package teste;

import java.util.Scanner;

public class DesafioConver {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String sal1, sal2, sal3;
		
		System.out.println("Digite o primeiro salario");
		sal1 = teclado.next();
		
		System.out.println("Digite o segundo salario");
		sal2 = teclado.next();
		
		System.out.println("Digite o terceiro salario");
		sal3 = teclado.next();
		
		sal1.replace(",", ".");
		sal2.replace(",", ".");
		sal3.replace(",", ".");
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.printf("Media "+ media);
	}

}
