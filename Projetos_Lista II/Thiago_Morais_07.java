package Lista;

import java.util.Scanner;

/*
    Fa�a um programa que solicite ao usu�rio que digite um caracter e em seguida imprima se o caracter
    digitado � ou n�o uma vogal.
*/
public class Thiago_Morais_07 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		char Caracter;
		
		System.out.println("Informe o caracter: ");
		Caracter =  entrada.next().charAt(0);
		
		if (Caracter == 'a' || Caracter == 'e' ||Caracter == 'i' ||Caracter == 'o' ||Caracter == 'u'  ) {
			System.out.println("O caracter � uma vogal");
		}
		else {
			System.out.println("O caracter � uma consoante");
			
		}
		
		
		
	}

}
