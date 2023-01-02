package oo.composicao;

import java.util.ArrayList;

public class Compra {
	//ArrayList do tipo Pedido
	ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	
	void adcionarItem(Pedido pedido) {
		this.pedidos.add(pedido);
		pedido.compra = this;
	}
	
	void adcionarItem(String nome, int quantidade, double preco) {
		this.adcionarItem(new Pedido(nome, quantidade, preco));
	}
	
	double valorTotal() {
		double total=0;
		//cria uma variavel do tipo Pedido
		//que recebe os valores do ArrayList pedidos
		for(Pedido pedido: pedidos) {
			//através da variavel pedidos, acessa os atributos da classe Pedidos
			//obtendo quantidade e preco
			//faz a multiplicação de cada pedido contido no array
			//e guarda em total
			total += pedido.quantidade * pedido.preco;
		}	
		return total;
	}
}
