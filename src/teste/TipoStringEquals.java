package teste;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		//s se trata de um objeto, logo são diferentes
		System.out.println("2" == s);
		//aqui é comparado apenas o conteudo
		System.out.println("2".equals(s));
	}
}
 