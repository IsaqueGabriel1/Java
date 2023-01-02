package teste;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom dia x";
		s = s.replaceAll("x", "Senhora");
		s = s.toUpperCase();
		
		String y = "Bom dia X".replace("X", "Gui").concat("!!!");
		
		
		System.out.println(y);
		System.out.println("Contem Bom dia? " + y.contains("Bom dia"));
		System.out.println("Tamanho de y = " + y.length());
	}
}
