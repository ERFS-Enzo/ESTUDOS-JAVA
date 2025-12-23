package aula_if_else;
import java.util.Scanner;
public class Financiamento {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    
    double salario, financiamento;
        System.out.println("Informe seu salario: ");
        salario=scanner.nextDouble();
        System.out.println("Informe o valor pretendido de financiamento: ");
        financiamento=scanner.nextDouble();
        if (salario <= 5*financiamento){
            System.out.println("Financiamento Concedido.");
        } else {
            System.out.println("Financiamento Negado.");
        }
        System.out.println("Obrigado por nos consultar!");
    }
}
