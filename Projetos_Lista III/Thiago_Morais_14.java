package LISTA_4;

import java.util.Scanner;

// Fatorial de um n�mero

public class Thiago_Morais_14 {

	
	 public static void main(String[] args) {
			
		Scanner entrada = new Scanner( System.in);
		 
		int Num, fatorial = 1;
		
		System.out.println("Informe o n�mero ");
		Num= entrada.nextInt();
		
	  	for (   int i = Num ;    i >=1 ;   i-- ) {
		
	  		
	  		fatorial = fatorial * i;
	  		
			// System.out.println(i);
		 }
	 	System.out.println(fatorial);
		 }
}
