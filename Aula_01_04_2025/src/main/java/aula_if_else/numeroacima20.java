package aula_if_else;
import java.util.Scanner;

public class numeroacima20 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       double N;
         System.out.println("Digite um numero qualquer: ");
         N=scanner.nextDouble();
         if (N > 20) {
             System.out.println("O numero e maior que 20");
         } else {
             System.out.println("O numero digitado nao e maior que 20");
         }
     } 
}
