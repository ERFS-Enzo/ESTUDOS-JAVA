package Exercicios;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double[] valor = new double[5];
        
        double maior=0, menor=0, soma=0;
        
        for(int i=0; i<5; i++){
            System.out.println("Digite um valor: ");
            valor[i]=ler.nextDouble();
            
            if(maior == 0 && menor ==0){
                maior = menor = valor[i];
            }
            if(valor[i] > maior){
                maior = valor[i];
            } 
            if(valor[i] < menor){
                menor = valor[i];
            }
            
            soma += valor[i];
        }
        double media = soma / 5;
        
        for(int i=0; i<5; i++){
            System.out.println(valor[i]);
        }
        System.out.println("O maior valor é: "+maior);
        System.out.println("O menor valor é: "+menor);
        System.out.println("A media dos numeros é"+media);
    }
}
