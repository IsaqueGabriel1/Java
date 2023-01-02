package oo.composicao.Exer3;

public class Pessoa {
	String nome;
	Animal animal;
	
	Pessoa(String nome, Animal animal){
		this.nome = nome;
		this.animal = animal;
	}
	String mostraRelacao() {
		return this.nome + " tem um " + this.animal.tipoAnimal + " que se chama " + this.animal.nomeAnimal;
	}
}
