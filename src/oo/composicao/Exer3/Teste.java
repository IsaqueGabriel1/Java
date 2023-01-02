package oo.composicao.Exer3;

public class Teste {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Isaque", new Animal("Lola", "Preto", "Gato"));
		String texto = pessoa.mostraRelacao();
		System.out.println(texto);
	}
}
