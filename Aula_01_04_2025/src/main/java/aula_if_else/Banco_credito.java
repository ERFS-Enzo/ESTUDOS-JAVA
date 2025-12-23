package aula_if_else;
import java.util.Scanner;
public class Banco_credito {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    double saldo_medio, credito;
        System.out.println("Informe seu saldo medio do ultimo ano: ");
        saldo_medio=scanner.nextDouble();
        if(saldo_medio >= 0 && saldo_medio <=200){
            System.out.println("Seu saldo medio e de: "+saldo_medio+" com isso, voce nao tera nenhum credito");
        } else if(saldo_medio >=201 && saldo_medio <=400){
            credito = saldo_medio * 0.2;
            System.out.println("Seu saldo medio e de: "+saldo_medio+" e seus creditos serao: "+credito);
        } else if(saldo_medio >=401 && saldo_medio <=600){
            credito = saldo_medio * 0.3;
            System.out.println("Seu saldo medio e de: "+saldo_medio+" e seus creditos serao: "+credito);
        } else{
            credito = saldo_medio * 0.4;
            System.out.println("Seu saldo medio e de: "+saldo_medio+" e seus creditos serao: "+credito);
        }
    }
}
