package oocomposicao.Exer2;

import java.util.ArrayList;

public class Empresa {
	ArrayList<Pessoa> funcionarios = new ArrayList<>();
	Pessoa pessoa;
	
	Empresa(){
		this.pessoa = new Pessoa(this);
	}
	
	void mostraFuncionario() {
		for(Pessoa funcionario: funcionarios) {
			System.out.println("Nome funcionario: "+funcionario.nome+"\n"+"Salario: "+funcionario.salario);
		}
	}
	
	void promocao() {}
	
	void contratar(String nome, double salario) {
		this.contratar(new Pessoa(nome, salario));
	}
	
	void contratar(Pessoa pessoa) {
		funcionarios.add(pessoa);
		pessoa.emprega = this;
	}
}
