package Basicos;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numero, soma;
        
        numero = 0;
        soma = 0;
        
        System.out.println("Digite um numero inteiro, ou 0 para parar: ");
        numero=ler.nextInt();
        soma += numero;
        while (numero > 0 || numero < 0){
            System.out.println("Digite um numero inteiro, ou 0 para parar: ");
            numero=ler.nextInt();
            
            soma += numero;
        }
        System.out.println("A soma de todos os numeros digitados é: "+soma);
    }
}

