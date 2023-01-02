package oo.composicao;

public class Motor {
		boolean ligado;
		double fatorInjecao = 1;
		
		int giros() {
			if(ligado == false) {
				return 0;
			}else {
				return (int) Math.round(fatorInjecao * 3000);
			}
		}
}
