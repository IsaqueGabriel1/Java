package oocomposicao.Exer2;

public class Item {
	String nome;
	int quantidade;
	double preco;
	//Relação bidimensional
	Compra compra;
	
	Item(String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
