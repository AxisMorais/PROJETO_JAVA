package LISTA_4;

import java.util.Scanner;

// Calculadora  simples 

public class Thiago_Morais_18 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		char resposta='S';
        int op��o = 0;
        int N1 = 0, N2=0, RESULTADO = 0;
			
		
		    System.out.println("Informe o nome: ");
		    nome=entrada.next(); 
		
		    System.out.println("-----------------------------");
		    System.out.println("Calculadora de " + nome);
		    System.out.println("-----------------------------");
		    
		    
		    while (resposta == 'S') {
		    
		    System.out.println("Informe o primeiro valor ");
		    N1=entrada.nextInt();
		    
		    System.out.println("Informe o segundo valor ");
		    N2=entrada.nextInt();
		    
		    entrada.nextLine();
		
			System.out.println("Op��es:\n 1- Soma \n 2- Subtra��o \n 3- Multiplica��o \n 4-Divis�o " );
			op��o =entrada.nextInt(); 
						
			switch (op��o) {

			   case 1: {
				    RESULTADO = N1 + N2;
				    break;
			    }
			   case 2: {

				RESULTADO = N1 - N2;
				break;
			    }
			   case 3: {

				RESULTADO = N1 * N2;
				break;
			    }
			   case 4: {
				RESULTADO = N1 / N2;
				break;
		    
			   }


		}
		
		
			
			System.out.println("Resultado da opera��o " + RESULTADO);
			
						
			System.out.println("Desejar fazer outra opera��o?  (S)- Sim ou (F)- Finalizar ");
		    resposta =entrada.next().charAt(0);
		    entrada.nextLine();
		}
		
		 System.out.println("Opera��o Finalizada");
	}
}
