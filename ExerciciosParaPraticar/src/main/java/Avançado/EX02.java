package Avançado;
import java.util.Scanner;
import java.util.Random;
public class EX02 {
    public static void main(String[] args) {     
        Scanner ler = new Scanner (System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int numero;
        int tentativas = 0;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.print("Digite seu numero: ");
            numero = ler.nextInt();
            tentativas++;

            if (numero < numeroSecreto) {
                System.out.println("O número é MAIOR que "+numero);
            } else if (numero > numeroSecreto) {
                System.out.println("O número é MENOR que "+numero);
            } else {
                System.out.println("Parabéns! Você acertou o número em "+tentativas+" tentativas!");
            }
        } while (numero != numeroSecreto);
    }
}
