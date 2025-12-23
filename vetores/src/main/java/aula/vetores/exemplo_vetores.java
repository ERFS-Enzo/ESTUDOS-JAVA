package aula.vetores;
import java.util.Scanner;
public class exemplo_vetores {
    public static void main(String[] args) {
        
        double[] notas = new double[5];
        double soma=0, media=0;
        Scanner scanner = new Scanner (System.in);
        
        for(int i=0; i<5; i++){
            System.out.println("Informe a nota "+i+" do aluno");
            notas[i]=scanner.nextDouble();
        }
        
        for(int j=0; j <5; j++){
            soma += notas[j];
        }
        media =  soma/5;
        
        System.out.println("A media das notas é: "+media);
    }
}
