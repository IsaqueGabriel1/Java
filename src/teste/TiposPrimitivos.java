package teste;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/***
		 * existem 8 tipos primitivos
		 * 6 são tipos numericos
		 * 2 sendo caracteres
		 * byte, short, int long = a diferença é so o tamanho
		 * 
		 * inteiros
		 * byte => 1 byte
		 * short => 2 bytes
		 * int = > 4 bytes
		 * long => 8 bytes
		 * 
		 * ponto flutuante
		 * float 4 bytes
		 * double 8 bytes
		 * 
		 * caracteres
		 * char = 'a' ou um espaço em branco '?' caracteres alfanumericos
		 * boolean = false e true
		 * 
		 * o Java observa os literais
		 * literal inteiro 3_243_845_223
		 * literal longo 3_243_845_223L
		 * 
		 * literal double 0.00 ou 123.22
		 * literal float 0.00F ou 123.22F
		 */
		
		//exemplos
		//Informações dos funcionarios
		//tipos numericos
			byte anosDeEmpresa = 23;
			short numeroDeVoos = 542;
			int id = 56789;
			//literal longo
			long pontosAcumulados = 3_243_845_223L;
			//tipos numericos reais
				//literal float
			float salario = 11_445.44F;
			double vendasAcumuladas = 2_991_797_103.01;
			
			boolean estaDeFerias = false;
			char status = 'A';
			
			System.out.println(anosDeEmpresa * 365);
			System.out.println(numeroDeVoos / 2);
			System.out.println(pontosAcumulados / vendasAcumuladas);
			System.out.println("O ID "+ id + " Ganha-> " + salario);
			System.out.println(anosDeEmpresa * 365);
			System.out.println("Ferias? " + estaDeFerias);
			System.out.println("Status:" + status);
			
	}
}
