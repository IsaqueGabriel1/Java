package ClassesMetodos;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezmail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezmail.com.br";
		
		//Dará falso pois são dois objetos distintos na memória
		System.out.println(u1 == u2);
		//falso, pois o equals do jeito que está, compara apenas endereco de memória
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		//verdadeiro pois o endereco de memória é o mesmo, assim como u2 == u2
		//System.out.println(u1 == u1);
		System.out.println(u2.equals(new Scanner(System.in)));
	}
}
