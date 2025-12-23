package Exercicios;
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int[][] matriz = new int [5][5];
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                
                if(i == j){
                    System.out.println("Digite o numero 1: ");
                    matriz[i][j]=ler.nextInt();
                }else{
                    System.out.println("Digite o numero 0: ");
                    matriz[i][j]=ler.nextInt();
                }
                
            }
        }
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }
    }
}
