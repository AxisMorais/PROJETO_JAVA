package LISTA_4;

/*
  Receba n�meros do usu�rio e imprima o triplo de cada n�mero. 
  O algoritmo deve encerrar ao ser digitado o n�mero �999. 
*/

import java.util.Scanner;

public class Thiago_Morais_04 {

	 public static void main(String[] args) {
			
		 Scanner entrada = new Scanner(System.in);
		 
		 int num = 0 , Triplo;
		 
		  do {
			
			System.out.println("Informe o n�mero a ser calculado o seu triplo ");	
		    num = entrada.nextInt();
			
			if (num != -9999 ) {
				Triplo =num *3;
				System.out.println("Triplo: " + Triplo);	
				System.out.println("O Sistema ser� encerrado ao ser digitado-9999  ");
			}else if (num == -9999 ){
				System.out.println("Sistema Encerrado");
			}
			      
			
		  }while (num != -9999); 
		 
		 
		 
		 /*	
	 * Escreva um algoritmo que receba n�meros do usu�rio e imprima o triplo de cada n�mero. 
	 * O algoritmo deve encerrar ao ser digitado o n�mero �999. Obs.: O triplo de -999 n�o deve ser exibido. 
		do {
			
		}while 
		 
	*/		
			
		 
	 }
}
