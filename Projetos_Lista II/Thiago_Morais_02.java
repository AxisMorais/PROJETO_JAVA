package Lista;

import java.util.Scanner;

//Classifique se o N�mero � par ou �mpar.

public class Thiago_Morais_02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int Numero, Resultado;

		System.out.println("Informe o n�mero:");
		Numero = entrada.nextInt();

		Resultado = (Numero % 2);

		if (Resultado != 0) {

			System.out.println("N�mero Impar");

		} else {
			System.out.println("Numero Par ");
		}
	}

}
