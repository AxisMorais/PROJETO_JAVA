package LISTA_4;

import java.util.Scanner;
// Analise de votos de determinada elei��o

public class Thiago_Morais_31 {

	
public static void main(String[] args) {
		
		

		 Scanner entrada = new Scanner(System.in);
	        int voto, op��o_1 = 0, op��o_2 = 0, op��o_3 = 0, op��o_4 = 0, op��o_5 = 0, op��o_6 = 0;

	        do {
	            System.out.println("====================\n" + "Votacao presidencial\n" + "====================\n" +
	                    "Op��es:\n" +
	                    "1 - Candidato 1\n" +
	                    "2 - Candidato 2\n" +
	                    "3 - Candidato 3\n" +
	                    "4 - Candidato 4\n" +
	                    "5 � Voto em branco\n" +
	                    "Outros valores positivos - Voto nulo\n" +
	                    "Para sair digite - 0\n" +
	                    "====================");
	            voto = entrada.nextInt();
	            if (voto < 0) {
	                System.err.println("VALOR INVALIDO, TENTE NOVAMENTE!");
	            }else if (voto == 0) {
	                System.err.println("Finalizando...");
	            }else if (voto == 1){
	                op��o_1 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 2){
	                op��o_2 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 3){
	                op��o_3 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 4){
	                op��o_4 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto == 5){
	                op��o_5 ++;
	                System.out.println("Voto concluido com sucesso");
	            }else if (voto > 5){
	                op��o_6 ++;
	                System.out.println("Voto concluido com sucesso");
	            }
	        } while (voto != 0);

	        System.out.println(
	                "====================\n" +
	                "Resultado:\n" +
	                "Candidato 1: " + op��o_1 +
	                "\nCandidato 2: " + op��o_2 +
	                "\nCandidato 3: " + op��o_3 +
	                "\nCandidato 4: " + op��o_4 +
	                "\nVotos em branco: " + op��o_5 +
	                "\nVotos nulo: " + op��o_6 +
	                "\n====================");

	        entrada.close();
			
			
		}
		
		

}
