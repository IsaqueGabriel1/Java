package oocomposicao.Exer2;

import java.util.ArrayList;

public class Compra {
	Empresa empregado = new Empresa();
	ArrayList<Item> itens = new ArrayList<>();
	
	//esse metodo pode ser rescrito por ter uma assinatura diferente
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		//adiciona um item
		//esse item é uma instancia da classe item
		itens.add(item);
		//pega o próprio objeto atual como referencia dentro de item
		item.compra = this;
	}
	
	double valorTotal() {
		int total=0;
		for(Item item: itens) {
			total += item.quantidade * item.preco;
		}
		return total;
	}
	
	void realizarCompra() {
		double valorTotal = valorTotal();
		for(Pessoa funcionario: empregado.funcionarios) {
			System.out.println(funcionario.salario);
		}
	}
}
