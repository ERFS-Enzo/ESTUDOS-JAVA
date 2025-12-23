package aula_if_else;
import java.util.Scanner;
public class QualMaiorQue10 {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    double N1, N2, N3;
        System.out.println("Informe um numero: ");
        N1=scanner.nextDouble();
        System.out.println("Informe outro numero: ");
        N2=scanner.nextDouble();
        System.out.println("Informe o ultimo numero: ");
        N3=scanner.nextDouble();
        if (N1 > 10 && N2 < 10 && N3 < 10){
            System.out.println("O primeiro numero e maior que 10");
        } else if(N2 >10 && N1 < 10 && N3 <10){
            System.out.println("O segundo numero e maior que 10");
        } else if(N3 >10 && N1 < 10 && N2 < 10){
            System.out.println("O Terceiro numero e maior que 10");
        } else{
            System.out.println("Nenhum ou mais de um numero e maior que 10");
        }
    }
}
