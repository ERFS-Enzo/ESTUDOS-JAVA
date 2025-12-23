package Intermediario;
import java.util.Scanner;
public class EX02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        int numero= 0;
        System.out.println("Escolha um numero: ");
        System.out.println("1 - Adicionar item ao carrinho");
        System.out.println("2 - Remover item do carrinho");
        System.out.println("3 - Listar itens do carrinho");
        System.out.println("0 - Sair");
        System.out.println(" ");
        numero=ler.nextInt();
        
        
        while(numero != 0 && numero < 4){
            System.out.println("Escolha um numero [1, 2, 3, 0]: ");
            numero=ler.nextInt();
        }
    }
}
