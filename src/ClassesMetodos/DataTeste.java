package ClassesMetodos;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data(24,04,2002);
		Data d2 = new Data();
		
		String data = d1.obterData();
		String data2 = d2.obterData();
		System.out.println(data);
		System.out.println(data2);
	}
}
