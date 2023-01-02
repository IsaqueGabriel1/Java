package teste;

public class NumeroParaTexto {
	public static void main(String[] args) {
		Integer num1 = 10000;
		//de numero pra string
		String sNum1 = num1.toString();
		System.out.println(sNum1.length());
		
		double num2 = 10.5;
		float num3 = 123.4F;
		//convertendo double para string;
		Double.toString(num2);
		//convertendo float para String
		Float.toString(num3);
		
	}
}
