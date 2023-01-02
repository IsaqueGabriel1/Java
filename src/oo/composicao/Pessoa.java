package oo.composicao;

public class Pessoa {
	String nome;
	int idade;
	Contrato contrato = new Contrato();
	
	Pessoa(String nome, int idade, double salario, String area){
		this.nome = nome;
		this.idade = idade;
		this.contrato.salario = salario;
		this.contrato.cargo = area;
	}
	
	
}
