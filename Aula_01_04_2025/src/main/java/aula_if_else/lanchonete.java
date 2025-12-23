package aula_if_else;
import java.util.Scanner;
public class lanchonete {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    int codigo, quantidade;
    double valor, vt;
        System.out.println("Informe o codigo do seu pedido: ");
        codigo=scanner.nextInt();
        System.out.println("Insira a quantidade que deseja: ");
        quantidade=scanner.nextInt();
        if(codigo == 100 || codigo == 103){
        valor = 1.10;
        vt= valor * quantidade;
            System.out.println("O valor total a ser pago é de: "+vt);
        } else if(codigo == 101 || codigo == 104){
        valor = 1.30;
        vt= valor * quantidade;
            System.out.println("O valor total a ser pago é de: "+vt);
        } else if(codigo == 102){
        valor = 1.50;
        vt= valor * quantidade;
            System.out.println("O valor total a ser pago é de: "+vt);
        } else if(codigo == 105){
        valor = 1.0;
        vt= valor * quantidade;
            System.out.println("O valor total a ser pago é de: "+vt);
        } else {
            System.out.println("Código inválido. Por favor, tente novamente.");
        }
    }
}
