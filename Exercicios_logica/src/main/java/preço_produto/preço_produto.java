package preço_produto;
import java.util.Scanner;

public class preço_produto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        double preco, produto;
        System.out.println("Insira o preço do produto: ");
        preco=scanner.nextDouble();
        produto= preco * 0.9;
        System.out.println("O novo valor do produto é: "+produto);
    }   
}
