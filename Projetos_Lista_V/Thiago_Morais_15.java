package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_15 {

	public static void main(String[] args) {
	
        Scanner entrada = new Scanner(System.in);
        
        String[] Vetor_Manicure = new String[5];
		double[][] Vetor_Servi�o = new double[5][3];
		double Soma;		
	//---------------------------------------------------------------------------------------------------	
		for(int i=0; i<Vetor_Servi�o.length; i++){
			System.out.println("Informe o nome da manicure:");
			Vetor_Manicure[i]=entrada.nextLine();	
			
			System.out.println("digite 1 para  unha dos p�s || digite 2 para unha das m�os || digite3 para podologia");	
			
			for(int i1=0; i1<Vetor_Servi�o[i1].length; i1++){
				System.out.println("Insira aqui o n�mero a quantidade de trabalhos realizadas");
				Vetor_Servi�o[i1][i1]=entrada.nextDouble();
				if(i1+1==1){
					Vetor_Servi�o[i1][i1]*=5;
				}else if(i1+1==2){
					Vetor_Servi�o[i1][i1]*=7.5;
				}else if(i1+1==3){
					Vetor_Servi�o[i1][i1]*=15;
				}
			}			
			entrada.nextLine();
		}	
	//-------------------------------------------------------------------------------------------	
		for(int i=0; i<Vetor_Servi�o.length; i++){
			Soma=0;
			System.out.println(Vetor_Manicure[i]);	
			for(int j=0; j<Vetor_Servi�o[i].length; j++){
				if(j+1==1){
					System.out.printf("P�s - R$  "+Vetor_Servi�o[i][j]);
					Soma+=Vetor_Servi�o[i][j];
				}else if(j+1==2){
					System.out.printf("\n M�os- R$  "+Vetor_Servi�o[i][j]);
					Soma+=Vetor_Servi�o[i][j];
				}else if(j+1==3){
					System.out.printf("\n Atendimento com Pod�loga -> R$  "+Vetor_Servi�o[i][j]);
					Soma+=Vetor_Servi�o[i][j];
				}			
			}
			System.out.printf("Custo total do servi�o ----------R$ %.2f\n",Soma);
		}
  }

}
