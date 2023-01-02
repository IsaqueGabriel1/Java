package DesafioModuloClasse;

public class Jantar {
	public static void main(String[] args) {
		Comida cm1 = new Comida("Arroz", 0.180);
		Comida cm2 = new Comida("Feijão", 0.300);
		Pessoa p1 = new Pessoa("Isaque", 99.8);
		
		System.out.println(p1.apresentar());
		p1.comer(cm1);
		System.out.println(p1.apresentar());
		p1.comer(cm2);
		p1.defecar();
		p1.beberAgua();
		System.out.println(p1.apresentar());
	}
}
