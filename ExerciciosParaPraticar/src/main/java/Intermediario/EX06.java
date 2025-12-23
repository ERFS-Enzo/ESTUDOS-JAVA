package Intermediario;
import java.util.Scanner;
public class EX06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double saldo=0, deposito, saque;       
        int escolha;
        
        System.out.println("Bem-Vindo(a)! O que deseja?");  
        do {
            System.out.println();
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.println(" ");
            escolha=ler.nextInt();
            
            switch(escolha){
                case 1: System.out.println("Escolha a quantia de deposito: ");
                        deposito=ler.nextDouble();
                        saldo += deposito;
                        System.out.println("Voce depositou: R$"+deposito);
                    break;
            
                case 2: System.out.println("Escolha a quantia de saque: ");
                        saque=ler.nextDouble();
                        if (saque <= saldo) {
                            saldo -= saque;
                            System.out.println("Você sacou: R$" + saque);
                        } else {
                          System.out.println("Saldo insuficiente para saque.");
                        }   
                    break;
            
                case 3: System.out.println("Seu saldo é de: R$"+saldo);
                        if(saldo == 0){
                            System.out.println("Deposite uma quantia para ter saldo");
                        }                   
                    break;
            
                case 0: System.out.println("Até logo!!");
                    break;
                
                default: System.out.println("opção Inválida. Tente novamente.");
            }
        } while (escolha != 0); 
        
    }
}
