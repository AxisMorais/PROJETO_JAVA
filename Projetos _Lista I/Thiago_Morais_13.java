package Thiago;

import java.util.Scanner;

//Calculo do N�mero de Copas

public class Thiago_Morais_13 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		int UE, NC;
		
		System.out.println("Informe o ano do �ltimo evento");
		UE =entrada.nextInt();
		
		NC= (((UE -1930)-2)/4);
		
		System.out.println(" O n�mero de copas � de: " + NC);
		
		
	}

}
