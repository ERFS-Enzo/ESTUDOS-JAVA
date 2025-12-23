package Basicos;
import java.util.Scanner;
public class EX05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int [][] matriz = new int[3][3];
        
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Informe o numero da linha "+i+" coluna "+j+": ");
                matriz[i][j]=ler.nextInt();
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf(" "+matriz[i][j]);
            }
            System.out.println("");
        }
    }
}
