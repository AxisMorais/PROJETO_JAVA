package Lista_Vetor;

import java.util.Arrays;
import java.util.Scanner;

public class Thiago_Morais_20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
       
		int comando;
        String nome[ ] = new String[50];
        double saldo[ ] = new double[50];
        int codigo[ ] = new int[50];
        int ncontas = 0, pesquisa, dinheiro;
        boolean repetida = false;
        
        do{
            System.out.println("Informe a op��o: 0 - Cadastro\n1 - Dep�sito\n2 - Saque\n3 - Consulta de saldo\n4 - Sair\n");
           comando = entrada.nextInt();
           entrada.nextLine();
           
           if(comando==0){
               if(ncontas==50){
                   System.out.println("Sistema cheio!");
               }else{
                   if(ncontas==0){
                       System.out.println("Digite seu nome:");
                       nome[ncontas] = entrada.nextLine();
                       System.out.println("Dig�te o c�digo da conta:");
                       codigo[ncontas] = entrada.nextInt();
                       System.out.println("Digite o saldo:");
                       saldo[ncontas]= entrada.nextDouble();
                       ncontas++;
                   }else{
                       do{
                     System.out.println("Dig�te o c�digo da conta:");
                       codigo[ncontas] = entrada.nextInt();
                       for(int i=0;i<ncontas;i++){
                           if(codigo[i]==codigo[ncontas]){
                               repetida = true;
                           
                               System.out.println("C�digo inv�lido ou j� existente:");
                               
                                       break;
                           }
                           }
                       }while(repetida==true);
                       System.out.println("Digite seu nome:");
                       entrada.nextLine();
                       nome[ncontas] = entrada.nextLine();
                       System.out.println("Digite o saldo:");
                       saldo[ncontas]= entrada.nextDouble();
                       ncontas++;
                   }
               }
           }
           else if(comando==1){
               repetida = false;
               System.out.println("Dig�te o c�digo da conta:");
               
               pesquisa = entrada.nextInt();
               
               for(int i=0;i<ncontas;i++){
                 if(codigo[i]==pesquisa){
                 repetida = true;
                           
                 System.out.println("Qual o valor do dep�sito:");
                 dinheiro = entrada.nextInt();
                 
                 saldo[i]+=dinheiro;
                
                 
                 break;
                 }
               }
               if(repetida==false){
                   System.out.println("Conta n�o cadastrada");
               }
               
               
           }
           else if(comando==2){
               repetida = false;
               System.out.println("Dig�te o c�digo da conta:");
               
               pesquisa = entrada.nextInt();
               
               for(int i=0;i<ncontas;i++){
                 if(codigo[i]==pesquisa){
                 repetida = true;
                           
                 System.out.println("Qual o valor do saque:");
                 dinheiro = entrada.nextInt();
                 if(saldo[i]<dinheiro){
                     System.out.println("Saldo insuficiente!");
                 }else{
                     saldo[i]-=dinheiro;
                 }
                 
                 break;
                 }
               }
               if(repetida==false){
                   System.out.println("Conta n�o cadastrada");
               }
               
           }
           else if (comando==3){
               repetida = false;
               System.out.println("Dig�te o c�digo da conta:");
               
               pesquisa = entrada.nextInt();
               
               for(int i=0;i<ncontas;i++){
                 if(codigo[i]==pesquisa){
                 repetida = true;
                           
                 System.out.println("O saldo � de "+nome[i]+" � de R$"+saldo[i]);
                 
                 break;
                 }
               }
               if(repetida==false){
                   System.out.println("Conta n�o cadastrada");
               }
               
           }
           else{
            System.out.println("C�digo inv�lido");
               
           }
        }while(comando!=4);
    }
}
