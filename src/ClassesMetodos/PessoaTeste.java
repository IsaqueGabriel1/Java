package ClassesMetodos;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Isaque";
		p1.corCabelo = "Castanho escuro";
		p1.corOlhos = "Castanho escuro";
		p1.corPele = "Pardo";
		p1.estadoSivil = "Solteiro";
		p1.idade = 10;
		p1.fazerAniversario();
		p1.fazerAniversario();
		p1.fazerAniversario();
		p1.fazerAniversario();
		p1.fazerAniversario();
		System.out.printf("Nome: %s", p1.nome);
		System.out.printf("\nCor do cabelo: %s",p1.corCabelo);
		System.out.printf("\nCor dos olhos: %s", p1.corOlhos);
		System.out.printf("\nCor da pele: %s", p1.corPele);
		System.out.printf("\nEstado sivil: %s",p1.estadoSivil);
		System.out.printf("\nIdade: %d", p1.idade);
		p1.falar("Cavalo");
		p1.podeDirigir(p1.idade);
		
		System.out.printf("\n%s pode dirigir? %s", p1.nome, p1.podeDirigir(p1.idade));
	}
}
