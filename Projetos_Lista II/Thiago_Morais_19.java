package Lista;

import java.util.Scanner;

public class Thiago_Morais_19 {

	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System .in);
		
		int binario = 0 , bit_1, bit_2, bit_3, bit_4  ;
		double decimal ;
		
		System.out.println("Informe um numero bin�rio de 4 d�gitos usando apenas 0 e 1");
		binario= entrada.nextInt(); 
		
		
		if (binario < 0 || binario >  1999 ) {
			System.out.println("NUMERO INV�LIDO! Esse n�mero � negativo, ou apresenta mais de 4 d�gitos");
		}
		else {
			bit_1 = binario % 10;
		    binario =binario/10; 
	       
	         
	        bit_2 = binario % 10;
	        binario =binario/10; 
	       
	        
	        bit_3 = binario % 10;
	        binario =binario/10; 
	       
	        
	        
	        bit_4 = binario % 10;
	        binario =binario/10;
	        
	        if((bit_1!=1 && bit_1!=0)||(bit_2!=1 && bit_2!=0)||(bit_3!=1 && bit_3!=0)||(bit_4!=1 && bit_4!=0)) {
	        	System.out.println("O n�mero n�o pode ser classificado como bin�rio");
	        }
	        else {
	        	System.out.println("N�mero Digitado � um bin�rio");
	        	decimal = (bit_1 * Math.pow(2, 0) + bit_2 * Math.pow(2, 1)+ bit_3 * Math.pow(2, 2)+ bit_4 * Math.pow(2, 3));
	            System.out.println("O bin�rio convertido para decimal �:" + decimal);
	        }
		}
		
		
		
		
		
				
			
		
	}
	
}
