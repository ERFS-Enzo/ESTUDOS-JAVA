package aula_if_else;
import java.util.Scanner;
public class QualNumeroMaior {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    int n1, n2, n3;
        System.out.println("Informe o primeiro numero: ");
        n1=scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2=scanner.nextInt();
        System.out.println("Informe o terceiro numero: ");
        n3=scanner.nextInt();
        if(n1 > n2 && n2 > n3){
            System.out.println("O primeiro numero e o maior");
        } else if(n2 > n1 && n1 > n3){
            System.out.println("O segundo numero e o maior");  
        } else if(n3 > n1 && n1 > n2){
            System.out.println("O terceiro numero e o maior");
        } else{
            System.out.println("algum dos numeros sao iguais");
        }
    }   
}
