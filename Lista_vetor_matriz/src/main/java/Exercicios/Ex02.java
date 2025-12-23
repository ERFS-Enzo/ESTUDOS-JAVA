package Exercicios;
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double [] numero = new double[10];
        
        int QuantidadeNegativo =0;
        double soma=0;
        
        for(int i=0; i<10; i++){
            System.out.println("Digite um numero: ");
            numero[i]=ler.nextDouble();
            
            if(numero[i] < 0){
                QuantidadeNegativo += 1;
            } else{
                soma += numero[i];
            }
        }
        System.out.println("Existem "+QuantidadeNegativo+" numeros negativos");
        System.out.println("A soma dos numeros positivos: "+soma);
    }
}