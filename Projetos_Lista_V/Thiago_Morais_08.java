package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
        int linhas, colunas;
        boolean Confirma��o_1 = false, Confirma��o_2 = false;
        
        System.out.println("Informe a  quantidade de linhas:");
        linhas = entrada.nextInt();
        
        System.out.println("Informe a  quantidade de colunas?");
        colunas = entrada.nextInt();
                
        int Soma_linha[] = new int [colunas];
        int somacoluna[ ] = new int[linhas];
        int matriz_resultado[][] = new int[linhas][colunas];
        
        //----------------------------------------------------------------------------------------
        for(int i=0; i<matriz_resultado.length; i++){
            Soma_linha[i]=0;
            for(int j=0; j<matriz_resultado[i].length; j++){
     //-----------------------------------------------------------------------------------------
            	
            do{
                System.out.println("Utilizando 0 e 1, informe os valores:  ");
                  matriz_resultado[i][j] = entrada.nextInt();
                if (matriz_resultado[i][j]!=0 && matriz_resultado[i][j]!=1){
                    System.err.println("Valor inv�lido");     
                }
               }while(matriz_resultado[i][j]!=0 && matriz_resultado[i][j]!=1);
               Soma_linha[i]+=matriz_resultado[i][j]; 
            }  somacoluna[i]+=Soma_linha[i];
          }
       //---------------------------------------------------------------------------------------------- 
        
        for(int i=0; i<Soma_linha.length; i++){
            if(Soma_linha[i]>1){
                System.out.println("N�o � uma Matriz");
            }else{
             Confirma��o_1 = true;
            }
            
        }
        for(int i=0; i<somacoluna.length; i++){
            if(somacoluna[i]>1){
                System.out.println("N�o � uma Matriz");
            }else{
                Confirma��o_2 = true;
            }
        }
        if (Confirma��o_1 ==true && Confirma��o_2==true){
            System.out.println("� matriz permuta��o");
        }
     //-------------------------------------------------------------------------------------   
        for(int i=0; i<matriz_resultado.length; i++){
            for(int j=0; j<matriz_resultado[i].length; j++){
                System.out.print(matriz_resultado[i][j]+" ");
            }
            System.out.println("\n");
        }  
    }

	}	

