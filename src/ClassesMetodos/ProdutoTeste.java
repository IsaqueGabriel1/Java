package ClassesMetodos;

public class ProdutoTeste {
	public static void main(String[] args) {
		//instancia da classe produto
		//criação de um objeto que herdará os atributos de Produto
		Produto p1 = new Produto("Notebook", 4356.89);
		var p2 = new Produto("Caneta Preta",12.56);
		//alterando desconto de todos os produtos da classe
		Produto.desconta = 0.50;
		
		System.out.printf("%s com desconto R$%.2f", p1.nome, p1.precoComDesconto());
		System.out.printf("\n%s com desconto R$%.2f", p2.nome, p2.precoComDesconto());
		
		
	}
}
