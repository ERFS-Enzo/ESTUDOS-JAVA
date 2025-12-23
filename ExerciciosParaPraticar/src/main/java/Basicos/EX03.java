package Basicos;
import java.util.Scanner;
public class EX03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numero=0, i=1, resultado;
        
        System.out.println("Insira um numero inteiro positivo: ");
        numero=ler.nextInt();
        for(i = 1; i <= 10; i++){
            resultado = numero * i;
            System.out.println("numero x "+i+"= "+resultado);
        }
        
    }
}
