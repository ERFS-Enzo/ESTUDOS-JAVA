package Desconto_produto;
import java.util.Scanner;

public class Desconto_produto {
    
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
        double preco, result;
        System.out.println("Informe o valor do produto: ");
        preco=scanner.nextDouble();
        result=preco-preco*0.1;
        System.out.println("O novo valor do produto é: "+result);
    }
}
