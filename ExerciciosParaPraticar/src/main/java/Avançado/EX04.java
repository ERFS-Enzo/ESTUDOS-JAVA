package Avançado;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        String [] nome = new String[10];
        int [] idade = new int[10];
        
        int maior=0, soma=0;
        String nomeVelho = "";
        
        for(int i=0; i<10; i++){
            System.out.println("Digite seu nome: ");
            nome[i]=ler.next();
            System.out.println("Digite sua idade: ");
            idade[i]=ler.nextInt();
            
            if(idade[i] > maior){
                maior = idade[i];
                nomeVelho = nome[i];
            }
            soma += idade[i];
        }
        double media = soma / 10.0;
        
        System.out.println("A Pessoa mais velha é "+nomeVelho+" que tem "+maior+" anos");
        System.out.println("A media das idades é: "+media);
    }
}
