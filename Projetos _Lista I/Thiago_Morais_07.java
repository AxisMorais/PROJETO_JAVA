package Thiago;

import java.util.Scanner;

//Calculo da �rea e do per�metro do retangulo 
public class Thiago_Morais_07 {

	public static void main (String[]Args)
	{
					
			Scanner entrada=new Scanner (System.in);
			float LARGURA_INFERIOR, LARGURA_SUPERIOR , ALTURA, P, AREA;
			
			System.out.println ("Informe o valor da largura Inferior do retangulo ");
			LARGURA_INFERIOR =entrada.nextFloat();
			
			System.out.println("Informe o valor da largura superior do retangulo ");
			LARGURA_SUPERIOR =entrada.nextFloat();
			
			
			System.out.println("Informe o valor da altura ret�ngulo");
			ALTURA = entrada.nextFloat();
			
			
						
			P= (ALTURA*2 + LARGURA_INFERIOR + LARGURA_SUPERIOR);
			AREA=(LARGURA_INFERIOR*ALTURA);
			
			System.out.printf(" O valor do per�mentro  � %.2f", P);
			System.out.println("O valor da �rea �: "+ ALTURA);
			
			
		
		
		
	}
	
	
	
}
