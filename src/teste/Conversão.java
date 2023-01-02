package teste;

public class Conversão {
	public static void main(String[] args) {
		int a = 1; //implicita
		
		//conversão explicita
		float b = (float) 1.1234; //explicita
		a = (int) b;//explicita
		System.out.println(a);
		
		//o limite do byte é de 127
		int c = 340;
		byte d = (byte) c;
		System.out.println(d);
	}
}
