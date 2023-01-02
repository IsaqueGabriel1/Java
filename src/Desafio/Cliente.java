package Desafio;

import java.util.ArrayList;

public class Cliente {
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double valorTot = 0;
		for(Compra compra: compras) {
			valorTot += compra.obterValorTotal();
		}
		return valorTot;
	}
}
