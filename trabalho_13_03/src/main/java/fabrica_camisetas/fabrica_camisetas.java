package fabrica_camisetas;
import java.util.Scanner;

public class fabrica_camisetas {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int P, M, G;
    double valor;
        
        System.out.println("informe a quantidade de camiseta P vendidas: ");
        P=scanner.nextInt();
        System.out.println("informe a quantidade de camiseta M vendidas: ");
        M=scanner.nextInt();
        System.out.println("informe a quantidade de camiseta G vendidas: ");
        G=scanner.nextInt();
        valor = (P * 10) + (M * 12) + (G * 15);
        System.out.println("o valor das vendas é de: "+valor);
    }
}
