package LISTA_4;

import java.util.Iterator;
import java.util.Scanner;

// Calculo do n�mero primo;

public class Thiago_Morais_13 {

	
	 public static void main(String[] args) {
		
		 Scanner entrada  = new Scanner( System.in);
		 
		 int Num, divisores=0;
		 
		 
		 System.out.println("Informe um n�mero inteiro");
		 Num=entrada.nextInt();
		 
		 
		 
		 for (int i = 1; i <= Num ; i++) {
			
			if (Num % i == 0) {
				divisores++;
			}
		 }
		 		 
		 if (divisores ==2) {
			System.out.println( Num + " � primo! ");
		 }else {
			System.out.println(Num + " N�o � primo!");
		 }
		 
		 
			 
		}
	 }

