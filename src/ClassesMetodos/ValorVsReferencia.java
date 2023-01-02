package ClassesMetodos;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		a++;
		b--;
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2002);
		//d2 recebe a referencia da memória de d1
		//ou seja, ambos estão apontando para o mesmo objeto
		Data d2 = d1; //Atribuição por referencia (objeto)
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025; 
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		System.out.println("Depois da primeira atribuição");
		//aqui o objeto esta sendo alterado
		voltarDataParaValorPadrao(d1);
		System.out.println(d1.obterData());
		System.out.println(d2.obterData());
		
		int c = 5;
		//aqui não fará diferença, pois não esta sendo passado
		//o endereco de memória de c 
		alterarPrimitivo(c);
		System.out.println(c);
	}
	
	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
