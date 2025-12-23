package Intermediario;
import java.util.Scanner;
public class EX05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int [][] matriz = new int[4][4];
        
        int somaP=0, somaS=0;
        
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                System.out.printf("Insira um numero entre 1 a 100: ");
                matriz[i][j]=ler.nextInt();   
                
                if(i == j){
                    somaP += matriz[i][j];
                }
                if(i + j == 3){
                    somaS += matriz[i][j];
                }
                
            }
        }
        
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                System.out.printf(" "+matriz[i][j]);                    
            }
            System.out.println();
        }
        System.out.println("A soma dos numeros da diagonal principal: "+somaP);
        System.out.println("A soma dos numeros da diagonal secundaria: "+somaS);
    }
}
