package Exercicios;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double[][] matriz = new double[4][4];
        
        int soma=0;
        
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                System.out.println("Digite um valor: ");
                matriz[i][j]=ler.nextDouble();
                
                if(matriz[i][j] > 10){
                    soma += 1;
                }
            }
        }
        System.out.println("Existem "+soma+" valores maior que 10");
    }
}
