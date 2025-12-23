package aula_if_else;
import java.util.Scanner;
public class Detran {
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    double valor, imposto;
    int ano;
        System.out.println("Informe o ANO do carro: ");
        ano=scanner.nextInt();
        System.out.println("Informe o VALOR do carro: ");
        valor=scanner.nextDouble();
        if(ano < 1990){
            imposto = valor * 0.01;
        } else {
            imposto = valor * 0.015;
        }
        System.out.println("O valor do imposto: "+imposto);
    }
}
