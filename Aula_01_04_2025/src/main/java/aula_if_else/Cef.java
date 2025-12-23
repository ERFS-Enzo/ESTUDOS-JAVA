package aula_if_else;
import java.util.Scanner;
public class Cef {
    public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    double saldo_medio, credito;
        System.out.println("Informe o seu saldo medio do ultimo ano: ");
        saldo_medio=scanner.nextDouble();
        if(saldo_medio <=500){
            System.out.println("Nenhum credito sera concedido");
        } else if(saldo_medio >=501 && saldo_medio <=1000){
            credito = ((30.0/100) * saldo_medio)* 1.02;
            System.out.println("Seu credito sera de: "+credito);
        } else if(saldo_medio >=1001 && saldo_medio <=3000){
            credito= ((40.0/100) * saldo_medio)* 1.02;
            System.out.println("Seu credito sera de: "+credito);
        } else if(saldo_medio >=3001){
            credito= ((50.0/100) * saldo_medio)* 1.02; 
            System.out.println("Seu credito sera de:"+credito);
        }
    }
    
}
