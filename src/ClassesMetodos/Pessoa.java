package ClassesMetodos;

public class Pessoa {
 	 String nome;
	String corPele;
	String corOlhos;
	int idade;
	String corCabelo;
	String estadoSivil;
	
	
	public void falar(String palavra){
		System.out.printf("\nA pessoa esta falando: %s", palavra);
	}
	public boolean podeDirigir(int idade) {
		if(idade >= 18) {
			return true;
		}else {
			return false;
		}
	}
	public void fazerAniversario() {
		this.idade += 1;
	}
}
