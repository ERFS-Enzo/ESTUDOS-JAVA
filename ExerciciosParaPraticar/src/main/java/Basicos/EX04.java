package Basicos;
import java.util.Scanner;
public class EX04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int[] numero = new int[5];
        
        int soma=0;
        double media;
        for(int i=0; i<5; i++){
            System.out.println("Digite um numero: ");
            numero[i]=ler.nextInt();
            
            soma += numero[i];
        }
        
        
        for(int i=0; i<5; i++){
            System.out.printf(" "+numero[i]);
        }
        System.out.println(" ");
        media = soma / 5;
        System.out.println("A media de todos os numeros listados é: "+media);
    }
}