package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	List<Pessoa> pessoas = new ArrayList<>();
	Pessoa pessoa;
	
	void contrata(Pessoa pessoa) {
		pessoas.add(pessoa);
	}
	
	String mostraContratados() {
		String resp = "";
		for(Pessoa pessoa: pessoas) {
			resp = "Nome do funcionario: "+pessoa.nome+"\n"+pessoa.contrato.mostraContrato();
			 return resp;
			 //System.out.println("");
		}
		return resp;
	}

	String pesquisaCargo(String cargo) {
		for(Pessoa pessoa: pessoas) {
			if(pessoa.contrato.cargo.equalsIgnoreCase(cargo)) {
				return "Nome funcionario: "+pessoa.nome+"\n"+"Cargo: "+pessoa.contrato.cargo;
			}
		}
		return cargo;
	}
	
}
