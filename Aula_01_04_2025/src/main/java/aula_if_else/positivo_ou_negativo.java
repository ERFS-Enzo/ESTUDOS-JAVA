package aula_if_else;
import java.util.Scanner;
public class positivo_ou_negativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N;
        System.out.println("Digite um numero");
        N=scanner.nextDouble();
        if (N < 0) {
            System.out.println("O numero digitado é negativo");
        } else {
            System.out.println("O numero digitado é positivo");
        }
    }
}
