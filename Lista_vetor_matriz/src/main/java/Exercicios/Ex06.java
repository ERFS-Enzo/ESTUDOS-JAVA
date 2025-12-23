package Exercicios;
import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int[][] matriz = new int [4][4];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                
                matriz[i][j] = i * j;
                
            }
        }
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print(" "+matriz[i][j]);
            }
            System.out.println();
        }
    }
}
