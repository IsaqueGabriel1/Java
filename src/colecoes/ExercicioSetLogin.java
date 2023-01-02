package colecoes;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExercicioSetLogin {

	
	public static void main(String[] args) {
		SortedSet<String> cadastro = new TreeSet<>();
		Scanner entrada = new Scanner(System.in);
		String login = "";
		String senha = "";
		String resp = "";
		
	
		while(!resp.equalsIgnoreCase("sair")) {
			
			System.out.println("------------------------------------------");
			System.out.println("Digite 1 para logar");
			System.out.println("Digite 2 para cadastrar");
			System.out.println("Digite sair para encessar o programa:");
			System.out.printf("opção desejada:");
			resp = entrada.nextLine();
			
			if(!resp.equals("sair")) {
				if(resp.equals("1")) {
					System.out.println("\n\n------------------------------------------");
					System.out.printf("Digite o nome de usuario:");
					login = entrada.nextLine();
					System.out.printf("Digite a senha:");
					senha = entrada.nextLine();
					
					if(cadastro.contains(login) && cadastro.contains(senha)) {
						System.out.println("\n------------------------------------------");
						System.out.println("\nLogado com sucesso");
						System.out.println("\n------------------------------------------");
					}else {
						System.out.println("\n------------------------------------------");
						System.out.println("\nSenha ou usuario invalidos");
						System.out.println("\n------------------------------------------");
					}
				}else if(resp.equals("2")) {
					System.out.println("\n\n------------------------------------------");
					System.out.printf("Digite o nome de usuario:");
					login = entrada.nextLine();
					System.out.printf("Digite a senha:");
					senha = entrada.nextLine();
					cadastro.add(login);
					cadastro.add(senha);
					System.out.println("\n------------------------------------------");
					System.out.println("\nCadastro realizado com sucesso");
					System.out.println("\n------------------------------------------");
				}else {
					System.out.println("Opção incorreta");
				}
			}
		}
		System.out.println("\n\n\n\n\n\n\n\n\n\nBoas festas");
		
		
		entrada.close();
	}
}
