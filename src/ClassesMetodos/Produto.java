package ClassesMetodos;

public class Produto {
	String nome;
	double preco;
	static double desconta = 0.25;
	
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto(){
		
	}
	
	double precoComDesconto() {
		return preco * (1 - desconta);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco * (1 - desconta + descontoGerente);
	}
}
