package Thiago;

import java.util.Scanner;

//Calculo das contas atrasadas de Jo�o

public class Thiago_Morais_11 {
	
	public static void main (String[]Args)
	{
		
		Scanner entrada =new Scanner (System.in);
		double CO_1, CO_2, SAL;
		
		System.out.println("Informe o valor do Sal�rio");
		SAL =entrada.nextDouble();
		
		System.out.println("Informe o valor da primera conta");
		CO_1= entrada.nextDouble();
		
		System.out.println("Informe a Terceira nota");
		CO_2= entrada.nextDouble();
		
		
		SAL=SAL-(CO_1+CO_2);
		
		System.out.printf(" O valor do sal�rio � %.2f", SAL);
		
		
	}
	

}
