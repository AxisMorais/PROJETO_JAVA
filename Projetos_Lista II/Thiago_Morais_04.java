package Lista;

import java.util.Scanner;

// C�lculo da equa��o de segundo grau 

public class Thiago_Morais_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double a, b , c,  delta, r1 = 0, r2 = 0; 
		
		System.out.println("Informe o valor dos coeficientes a,b , c");
		
		a=entrada.nextDouble();
		b= entrada.nextDouble();
		c= entrada.nextDouble();
		
		if (a == 0) {
			System.out.println("N�o � uam fun��o do 2� Grau");
			if (b == 0) {
				System.out.println("N�o � uma fun��o do 1� Grau");
			} else {
				r1 = (-c / b);
				System.out.println("A raiz da equa��o do  1� Grau �: " + r1);
			}

		} else {
			delta = (Math.pow(b, 2)) - (4 * a * c);

			if (delta < 0) {
				System.out.println("N�o existe h� raizes reais");
			} else {
				r1 = (-b + Math.sqrt(delta)) / (2 * a);
				r2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("O valor da primera raiz �: " + r1);
				System.out.println("O valor da segunda raiz � de:" + r2);
			}
			
		}

	}

}
