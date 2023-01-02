package EstruturaDeControle;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		String indice = "#####";
		
		for(int i=1; i<=indice.length(); i++) {
			System.out.println(valor);
			valor+="#";
		}
		//resolucao
		for(String v = "#"; !v.equals("######"); v+="#") {
			System.out.println(v);
		}
	}
}
