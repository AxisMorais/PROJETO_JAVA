package Thiago;

//Formulas da �rea do trap�zio 

import java.util.Scanner;

public class Thiago_Morais_08 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		float B, b, h, v, A, VT;
		
		System.out.println("Informe o valor da base maior do trap�zio:");
		B =entrada.nextFloat();
		
		System.out.println("Informe o valor da base menor do trapezio:");
		b =entrada.nextFloat();
		
		System.out.println("Informe o valor da altura trapezio:");
		h =entrada.nextFloat();
		
		System.out.println("Informe o valor de venda do metro quadrado");
		v =entrada.nextFloat();
		
		A= ((B*b*h)/2);
		VT=(A*v);
		
		
		System.out.printf(" O valor da M�dia � R$ %.2f", VT);
		
		
	}
	
	
	
}
