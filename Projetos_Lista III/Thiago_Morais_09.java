package LISTA_4;

import java.util.Scanner;

//Fa�a um programa que calcule e imprima a soma e a m�dia de N n�meros digitados pelo usu�rio.
//O valor de N deve ser fornecido pelo usu�rio.

public class Thiago_Morais_09 {

	 public static void main(String[] args) {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 int N=0;
		 double resultado=0, soma = 0, valor=0; 
		 
		 System.out.println("Com quantos n�meros deseja calcular m�dia ");
		 N=entrada.nextInt();
		 
		 for (int i = 1; i <= N; i++) {
			 
			 System.out.println("Informe os valores que deseja somar");
             valor= entrada.nextDouble();  			
			 soma =  soma + valor;
		
		 }
		 resultado =soma/N;
		 System.out.println("Resultado do calculo da m�dia �:"+ resultado );
	 }
	
}
