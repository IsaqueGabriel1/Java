package Desafio;

import java.util.ArrayList;

public class Compra {
	
	String nome;
	final ArrayList<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}
	
	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	double obterValorTotal() {
		double valor = 0;
		for(Item item: itens) {
			valor += item.quantidade * item.produto.preco;
		}
		return valor;
	}
	
}
