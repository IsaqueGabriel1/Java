package oo.composicao;

public class ClienteTeste {
	public static void main(String[] args) {
		 Compra compra = new Compra();
		 //como pedidos é do tipo Pedido, ele pode receber como paramentro
		 //um objeto do tipo Pedido
		 compra.adcionarItem("Caneta", 20, 7.45);
		 compra.adcionarItem(new Pedido("Lapez", 12, 7.45));
		 compra.adcionarItem(new Pedido("Borracha", 10, 7.45));
		 
		 //compra é uma classe que contem a coleção pedidos
		 //onde será armazenado os dados
		 System.out.println(compra.pedidos.size());
		 System.out.println(compra.valorTotal());
		 
		 //demostrar a relação bidirecional
		 compra.pedidos.get(0).compra.pedidos.get(1).compra.valorTotal();
	}
}
