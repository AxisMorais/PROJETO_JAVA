package Lista;

import java.util.Scanner;

//Calculadora Simples

public class Thiago_Morais_06 {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		int opera��o;
		double Num_1, Num_2, resultado;
		
		System.out.println("Informe o item de acordo com as categorias das opera��es:");
		System.out.println("1 para soma, 2 para subtra��o, 3 para multiplica��o, 4 para divis�o");
		opera��o = entrada.nextInt();
		
		
		System.out.println("Informe o valor do primeiro n�mero: ");
		Num_1 = entrada.nextDouble();
		
		
		System.out.println("Informe o valor do n�mero: ");
		Num_2 = entrada.nextDouble();
				
		switch (opera��o) {
		case 1: {
			resultado = Num_1 + Num_2;
			System.out.println("Resultado da soma: " + resultado);
			break;
		}

		case 2: {
			resultado = Num_1 - Num_2;
			System.out.println("Resultado da Subtra��o : " + resultado);
			break;

		}
		case 3: {
			resultado = Num_1 * Num_2;
			System.out.println("Resultado da Multiplica��o: " + resultado);
			break;

		}
		case 4: {
			resultado = Num_1 / Num_2;
			System.out.println("Resultado da Divis�o: " + resultado);
			break;

		}
		
		
		}
	}
	
}
