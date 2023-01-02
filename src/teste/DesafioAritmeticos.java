package teste;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double fatorEq1 = 6 * (3+2);
		double eq1 = Math.pow(fatorEq1, 2) / (3*2);
		
		double fatorEq2 = (1-5)*(2-7) / 2;
		double eq2 = Math.pow(fatorEq2, 2);
		
		double subEqs = eq1 - eq2;
		double eq3 = (int) Math.pow(subEqs, 3) / (Math.pow(10, 3));
		
		System.out.println(eq3);
	}
}
 