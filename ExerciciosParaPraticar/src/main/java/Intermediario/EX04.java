package Intermediario;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int[] numero = new int[10];
        
        int maior = 0;
        int menor = 0;
        int NumeroPar = 0;
        
        for(int i=0; i<10; i++){
            System.out.println("Informe um numero inteiro positivo");
            numero[i]=ler.nextInt();    
            
            if(maior == 0 && menor == 0){
                menor = maior = numero[i];
            }
            if(numero[i] > maior){
                maior = numero[i];
            }
            if(numero[i] < menor){
                menor = numero[i];
            }
            
            if(numero[i] % 2 == 0){
                NumeroPar += 1;
            }
            
        }
       
        System.out.println("O maior numero é: "+maior);
        System.out.println("O menor numero é: "+menor);
        System.out.println("Existem "+NumeroPar+" numeros pares");
    }
}
