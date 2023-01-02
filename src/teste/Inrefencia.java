package teste;

public class Inrefencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		var b = 4.5;
		System.out.println(b);
		var c = "Texto";
		System.out.println(c);
		c = "Outro texto";
		System.out.println(c);
		
		//var reconheco o tipo da infomação e se tranforma no tipo dela
		//c = 4.5 é errado
	}
}
