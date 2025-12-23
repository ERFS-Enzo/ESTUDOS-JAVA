package aula.matrizes;
import java.util.Scanner;
public class Matrizes {
    public static void main(String[] args) {
        double [][] notas = new double[3][3];
        Scanner scanner = new Scanner(System.in);
        
        for(int l=0; l<=2; l++){
            for(int c=0; c<=2; c++){
                System.out.println("Digite a nota: linha "+l+" coluna "+c);
                notas[l][c]=scanner.nextDouble();
            }
        }
        
        for(int l=0; l<=2; l++){
            for(int c=0; c<=2; c++){
                System.out.println("O valor da nota "+l+" Da coluna "+c+ "é de "+notas[l][c]);
            }
        }
    }
}
