package teste;

public class Ternario {
	public static void main(String[] args) {
		double media = 4.6;
		
		String resultadoFinal = media >= 7.0 ? "Aprovado" : media >= 5.5 ? "Em recuperação" : "Reprovado";
		System.out.println(resultadoFinal);
	}
}
