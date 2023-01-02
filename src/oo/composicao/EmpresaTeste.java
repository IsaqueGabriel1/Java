package oo.composicao;

public class EmpresaTeste {
	public static void main(String[] args) {
		Empresa e1 = new Empresa();
		
		
		e1.contrata(new Pessoa("Isaque", 20, 1.500, "Dev JS"));
		e1.contrata(new Pessoa("Mariana", 24,1.500, "Dev Java"));
		e1.contrata(new Pessoa("Davi", 30, 1.500, "Dev C"));
		
		//e1.mostraContratados();
	    String teste = e1.pesquisaCargo("Dev js");
	    System.out.println(teste);
	}
}
