package Lista;

import java.util.Scanner;

public class Thiago_Morais_26 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float Imposto = 0, G = 0, Sal�rio, Tempo_Servi�o; 
        System.out.println("informe o salario: ");
        Sal�rio = teclado.nextInt();
        System.out.println("Informe o tempo de servico: ");
        Tempo_Servi�o = teclado.nextInt();
        if(Sal�rio < 200){
            System.out.println("Isento de imposto!!");
        }
        else if(Sal�rio >= 200 && Sal�rio <= 450){
            Imposto = ((Sal�rio * 3)/100);
            System.out.println("Imposto de: " + Imposto);
        }
        else if(Sal�rio >= 450 && Sal�rio < 700){
            Imposto = ((Sal�rio * 8)/100);
            System.out.println("Imposto de: " + Imposto);
        }
        else if(Sal�rio >= 700){
            Imposto = ((Sal�rio * 12)/100);
            System.out.println("Imposto de: " + Imposto);
        }
        if(Sal�rio > 500 && Tempo_Servi�o <= 3){
            G = (Sal�rio * 20)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Sal�rio > 500 && Tempo_Servi�o > 3){
            G = (Sal�rio * 30)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Sal�rio <= 500 && Tempo_Servi�o <= 3){
            G = (Sal�rio * 23)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Sal�rio <= 500 && Tempo_Servi�o > 3 && Tempo_Servi�o < 6){
            G = (Sal�rio * 35)/100;
            System.out.println("Gratificacao de: " + G);
        }
        else if(Sal�rio <= 500 && Tempo_Servi�o > 6){
            G = (Sal�rio * 33)/100;
            System.out.println("Gratificacao de: " + G);
        }
        Sal�rio = (Sal�rio - Imposto) + G;
        System.out.println("Salario liquido: " + Sal�rio);
        if(Sal�rio <= 350){
            System.out.println("Categoria: A");
        }
        else if(Sal�rio > 350 && Sal�rio <600){
            System.out.println("Categoria: B");
        }
        else{
            System.out.println("Categoria: C");
        }
		
	}
}
