package Lista_06;

import java.util.Scanner;

public class Thiago_Morais_09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        int matriz[][] = new int[8][8], inv[][] = new int[8][8];
        int confirma�ao=0;
        for (int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
                System.out.println("Informe("+i+","+j+")");
                matriz[i][j] = entrada.nextInt();
                inv[j][i] = matriz[i][j];
            }
        }
        for (int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[i].length; j++){
            if(matriz[i][j]!=inv[i][j]){
                confirma�ao++;
            }    
            }
        }
        if(confirma�ao>0){
            System.out.println("Matriz assim�trica");
        }else{
            System.out.println("Matriz sim�trica");
        }
        
		
		
		
 }
}