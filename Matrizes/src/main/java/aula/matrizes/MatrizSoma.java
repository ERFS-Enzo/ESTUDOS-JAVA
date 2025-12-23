package aula.matrizes;
import java.util.Scanner;
public class MatrizSoma {
    public static void main(String[] args) {
        
        double [][] matrizA = new double[3][3];
        Scanner ler = new Scanner (System.in);
        int l, c;
        double sec, somaP=0, somaS=0;
        //PROVA: matriz 3x3 fazer soma da diagonal secundaria       
        //Para agora, fazer soma da diagonal principal e da diagonal secundaria matrix 3x3
        l=0;
        c=0;
        for(l=0; l<=2; l++){
            for(c=0; c<=2; c++){
                System.out.println("Digite o numero da: linha "+l+" coluna "+c+":");
                matrizA[l][c]=ler.nextDouble();
                
                sec=l+c;
                if(l == c){
                    somaP += matrizA[l][c];
                }
                if(sec == 2){
                    somaS += matrizA[l][c];
                }
            }
        }
        System.out.println("A soma da diagonal principal: "+somaP);
        System.out.println("A soma da diagonal secundaria: "+somaS);
        
        
    }
}
