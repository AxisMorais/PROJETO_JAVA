package Lista_Vetor;

import java.util.Scanner;

public class Thiago_Morais_15 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		    int N = 5;
	        int vet[ ] = new int[N];
	        int soma = 0, produto = 1;
	     
	        for(int i = 0; i < N;i++){
	            System.out.println("Informe o valor da  "+( i +1)+ "� Posi��o do Vetor:  ");
	            vet[i] = entrada.nextInt();
	            
	            soma += vet[i];
	            produto *= vet[i];
	        }
	        
	        System.out.println("Som�torio : " + soma);
	        System.out.println("Produt�rio : " + produto);
	        
		
		
		
	}
	
}
