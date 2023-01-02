package teste;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		//c = c + b;
		//acrescentando o que esta em b em c
		c+= b;
		c-= a;
		c*=b;
	}
}
