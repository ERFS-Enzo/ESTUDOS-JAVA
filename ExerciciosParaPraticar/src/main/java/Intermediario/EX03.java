package Intermediario;
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int fatorial = 1;
        
        System.out.println("Digite um numero: ");
        int numero=ler.nextInt();
        
        if(numero < 0){
            System.out.println("Numero Invalido, digite um inteiro positivo");
            return;
        }
        
        for(int i = 1; i <= numero; i++){
            fatorial *= i;
        }
        System.out.println("O fatorial de "+numero+" = "+fatorial);
    }
}
