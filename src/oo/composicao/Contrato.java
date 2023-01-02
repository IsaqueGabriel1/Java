package oo.composicao;

public class Contrato {
	double salario;
	String cargo;
	//Pessoa pessoa;
	
	
	String mostraContrato() {
		return "Salario: " + this.salario + "\nCargo: " + this.cargo;
	}
}
