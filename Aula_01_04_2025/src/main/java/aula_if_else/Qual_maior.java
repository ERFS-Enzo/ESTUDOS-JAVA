package aula_if_else;
import java.util.Scanner;

public class Qual_maior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B;
        System.out.println("Insira um numero: ");
        A=scanner.nextDouble();
        System.out.println("Insira outro numero: ");
        B=scanner.nextDouble();
        if (A > B){
            System.out.println("O Numero A e maior do que o B");
        } else if(B > A){
            System.out.println("O Numero B e maior do que o A");
        } else {
            System.out.println("Os numeros sao iguais");
        } 
    }
}
