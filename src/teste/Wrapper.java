package teste;

public class Wrapper {
	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		// convertendo uma strins em inteiro
		Integer i = Integer.parseInt("1000");
		Long l = 100000L;

		System.out.println(b.byteValue());
		
		// convertendo um Short em string
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(i/3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		//convertendo string em boolean
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		//convertendo boolean em string
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString().concat("!!!"));
	}
}
