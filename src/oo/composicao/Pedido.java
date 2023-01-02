package oo.composicao;

public class Pedido {
	String nomePedido;
	int quantidade;
	double preco;
	Compra compra;
	//Construtor
	Pedido(String nome, int quantidade, double preco){
		this.nomePedido = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
