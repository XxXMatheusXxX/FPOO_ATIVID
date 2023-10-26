package Calcule
;

public class Main {

	public static void main(String[] args) {
		
		Adicionar calculo = new Adicionar();
		Subtrair sub = new Subtrair();
		Calcular cal = new Calcular();
		Expo exp = new Expo();
		
		
		System.out.println(calculo.somar(12, 1));
		System.out.println("");
		
		System.out.println(sub.sub(15, 2));
		System.out.println("");
		
		System.out.println(cal.mult(8, 2));
		System.out.println("");
		
		System.out.println(cal.div(12, 2));
		System.out.println("");
		
		System.out.println(exp.exp(5, 2));
		System.out.println("");
		
		
	}

}
