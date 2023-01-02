package DesafioModuloClasse;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(){
		
	}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida){
		if(comida != null) {
			this.peso += comida.pesoComida;
		}
	}
	
	String apresentar() {
		return "Olá eu sou o " + nome + " e tenho " + peso + " Kgs.";
	}
	
	void defecar() {
		this.peso -= 0.100;
	}
	
	void beberAgua() {
		this.peso += 0.50;
	}
}
