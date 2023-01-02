package ClassesMetodos;

public class Data {
	//atributo de instancia
	int dia;
	int mes;
	int ano;
	//Variaveis locais devem ser inicializadas de forma explicita
	//as variaveis da classe não possuem essa necessidade
	Data(){
		this(1,1,1970);
	}
	//this é utilizado para referenciar o objeto atual
	//this é uma instancia da classe
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	//metodo de instancia
	 String obterData(){
		//variavel local
		String formato = "%d/%d/%d";
		return String.format(formato, this.dia, this.mes, this.ano);
	}
}
