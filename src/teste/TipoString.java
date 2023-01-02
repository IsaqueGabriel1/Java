package teste;

public class TipoString {
	public static void main(String[] args) {
		//letra no indice 0;
		System.out.println("Olá pessoal".charAt(0));
		
		String s  = "Bom tarde";
		System.out.println(s.concat("!!!"));
		//s começa com bom?
		System.out.println("Começa com bom?"+s.toLowerCase().startsWith("bom"));
		//s começa com Bom?
		System.out.println("começa com Bom?"+s.startsWith("Bom"));
		//Termina com dia?
		System.out.println("termina com tarde?"+s.endsWith("tarde"));
		//compara as strings
		System.out.println("Bom tarde é igual a Bom tarde?"+s.equals("Bom tarde"));
		System.out.println("boa tarde é igual a Bom tarde"+s.equalsIgnoreCase("bom tarde"));
	}
}
