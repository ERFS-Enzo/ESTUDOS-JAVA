package aula.vetores;
import java.util.Scanner;
public class Ex1 {
    public static void main (String[]args){
    
        double[] nota = new double[5];
        double soma=0;
        Scanner scanner = new Scanner (System.in);
        
        for(int i=0; i<5; i++){
            System.out.println("Informe a nota "+i+" do aluno");
            nota[i]=scanner.nextDouble();
        }
        for(int j=0; j<5; j++){
            soma += nota[j];
        }
        System.out.println("A soma das notas na posição 6: "+soma);
    }
}
