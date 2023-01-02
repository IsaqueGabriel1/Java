package ClassesMetodos;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc(5.6);
		AreaCirc.numeroZ = 12;
		//PI é um atributo pertencente a classe
		//ou seja, não precisa da criação de uma instancia
		//Pode ser acessado através de sua classe original
		System.out.println(AreaCirc.PI);
		
		//esse area é um atributo que pertence a instancia
		//Isso é definido na classe abstrata, através da palavra STATIC
		//Normalmente essa palavra vem acompanhada de final, que deixa a variavel
		//constante
		System.out.println("Area instancia: "+a.area());
		System.out.println("Area da classe: "+AreaCirc.area(100));
		
		AreaCirc b = new AreaCirc(4.4);
		
		AreaCirc c = new AreaCirc(3.3);
		System.out.println(c.numeroZ);
	}
}
