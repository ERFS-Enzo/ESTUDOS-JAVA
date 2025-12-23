package aula_if_else;
import java.util.Scanner;

public class positivo_negativo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor;
        System.out.println("Informe o valor: ");
        valor=scanner.nextInt();
        if(valor >=0){
            System.out.println("Valor positivo");
        } else {
            System.out.println("Valor negativo");
        }
    }
}
