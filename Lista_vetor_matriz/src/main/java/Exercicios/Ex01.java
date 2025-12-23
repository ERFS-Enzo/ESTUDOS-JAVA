package Exercicios;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double[] nota = new double[15];
        
        double soma=0, media;
        
        for(int i=0; i < 15; i++){
            System.out.println("Insira a nota do aluno: ");
            nota[i]=ler.nextDouble();
            
            soma += nota[i];
        }
        media = soma/15;
        System.out.println("A media das 15 notas é: "+media);
    }
}
