package oocomposicao.Exer2;

public class Pessoa {
	String nome;
	double salario;
	Empresa emprega;
	
	Pessoa(Empresa emprega){
		this.emprega = emprega;
	}
	
	Pessoa(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	void debitarSalario(double valor) {
		this.salario = this.salario - valor;
	}
}
