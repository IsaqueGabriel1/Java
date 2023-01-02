package teste;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		//se os dois trabalhos derem certo, compra tv de 50
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		//se apenas um trabalho der certo, compra tv de 32
		boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
		//se comprou tv50 ou tv32, vai tomar sorvete
		boolean tomarSorvete = tv50 || tv32;
		//se não tomar sorve, vai ficar mais saudavel
		boolean ficarSaudavel = !tomarSorvete;
		
		System.out.printf("Ir pro shopping comprar tv de 50p? %s", tv50);
		System.out.printf("\nIr pro shopping comprar tv de 32p? %s", tv32);
		System.out.printf("\nTomar sorvete? %s", tomarSorvete);
		System.out.printf("\nFicar mais saudavel? %s", ficarSaudavel);
	}
}
