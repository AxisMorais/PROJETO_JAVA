package Thiago;

import java.util.Scanner;

//Calculo da Comiss�o 

public class Thiago_Morais_06 {

	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		Double SF, NV, C, NS, P;
		
		System.out.println("Informe o valor do Sal�rio Fixo");
		SF =entrada.nextDouble();
		
		System.out.println("Informe o n�mero de vendas realizadas");
		NV =entrada.nextDouble();
		
		System.out.println("Informe o valor do Pre�o do produto");
		P =entrada.nextDouble();
		
		C= (( NV * P *0.04 ));
		NS=(SF + C);		
		
		System.out.printf(" O valor da M�dia � %.2f", NS);
		
		
	}
}
