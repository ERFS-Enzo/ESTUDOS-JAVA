package aula_if_else;
import java.util.Scanner;
public class prefeitura_contagem {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        double salario_bruto, prestacao, porcentagem;
        System.out.println("Insira o salario bruto: ");
        salario_bruto=scanner.nextDouble();
        System.out.println("Insira o valor da prestação: ");
        prestacao=scanner.nextDouble();
        porcentagem = (30/100) * salario_bruto;
        if (prestacao < porcentagem){
            System.out.println("O emprestimo nao podera ser concedido");
        } else {
            System.out.println("O emprestimo podera ser concedido");
        }
    }
}
