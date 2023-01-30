package LISTA_4;

import java.util.Scanner;

/* Classificar o n�mero em palindromo ou n�o. 
   Palindromo: N�mero que pode ser lido da direita para esquerda, ou o contr�rio, sem alterar
   Exemplo: 121  

*/


public class Thiago_Morais_21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		 int Numero,        /* numero dado                                  */
	      Auxiliar,        /* guarda o pedaco do numero que resta inverter */
	      reverso;         /* guarda o numero de tras para frente          */

	  System.out.println("Digite um natural: ");
	  Numero=entrada.nextInt();

	  /* inicializacoes */
	  Auxiliar = Numero;
	  reverso = 0;

	  while (Auxiliar != 0) {
	    reverso = reverso * 10 + Auxiliar % 10;  /* acrescenta mais um digito a direita */
	    Auxiliar = Auxiliar / 10;                     /* joga fora esse digito */
	  }

	  if (reverso == Numero) {
	   System.out.printf("%d � palindrome\n", Numero);
	  } 
	  else {
		  System.out.printf("%d n�o � palindrome\n", Numero);
	  }

		
}
}

