package Lista_Vetor;
import java.util.Iterator;
import java.util.Scanner;

//M�dia das alturas de atleas que podem ou n�o participar da competi��o

public class Thiago_Morais_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double inscri��o[] = new double [20];
		double Media=0;
		
		for (int i = 0; i < inscri��o.length; i++) {
			
			System.out.println("Informe a altura ");
			inscri��o[i] = entrada.nextInt();
				
			Media+=  inscri��o[i];
			Media/= inscri��o.length;
						
			}
		for (int i = 0; i < inscri��o.length; i++) {
			
			if (inscri��o[i] >= Media) {
				System.out.println("Atleta com a altura: " + inscri��o[i]+ " est� autorizado a participar");
			}
		}
		System.out.println(" Os demais atletas com altura inferior a: " + Media+ ",   n�o podem participar");
		
			
		}
		
	}
	
	

