package LISTA_4;

import java.util.Scanner;

/*
   Implemente um algoritmo que receba de entrada N valores digitados pelo usu�rio.
   Dentre os valores digitados, seu programa deve encontrar o menor e o maior dos valores fornecidos.
*/
public class Thiago_Morais_10 {

	 public static void main(String[] args) {
	
		 Scanner entrada = new Scanner(System.in);
		 
		 int N = 0;
		 char resposta='S';
		 
		 while ( resposta == 'S') {
			
			 System.out.println("Informe o n�mero:");
			 N=entrada.nextInt();
		    
			 System.out.println("Deseja cadastrar outro n�meros?  S (sim) ou E para (Sair) ");
			 resposta=entrada.next().charAt(0);
			 resposta=Character.toUpperCase(resposta);
			 
			 //resposta=Math.			
		}
		
		 System.out.println("acabou");
		
	 }
}
