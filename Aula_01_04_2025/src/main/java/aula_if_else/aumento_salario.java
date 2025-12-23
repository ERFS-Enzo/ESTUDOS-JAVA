package aula_if_else;
import java.util.Scanner;
public class aumento_salario {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    double salantigo, salnovo;
    int codigo;
        System.out.println("Informe seu salario antes do aumento: ");
        salantigo=scanner.nextDouble();
        System.out.println("Informe seu codigo: ");
        codigo=scanner.nextInt();
        if (codigo == 101){
            salnovo = salantigo * 1.10;
            System.out.println("Ola Gerente, seu antigo salario era de: "+salantigo);
            System.out.println("E seu novo salario e de: "+salnovo);
        } else if(codigo == 102){
        salnovo = salantigo * 1.20;
            System.out.println("Ola Engenheiro, seu antigo salario era de: "+salantigo);
            System.out.println("E seu novo salario e de: "+salnovo);
        } else if (codigo == 103){
        salnovo = salantigo * 1.30;
            System.out.println("Ola Tecnico, seu antigo salario era de: "+salantigo);
            System.out.println("E seu novo salario e de: "+salnovo);
        } else {
        salnovo = salantigo * 1.40;
            System.out.println("Ola, seu antigo salario era de: "+salantigo);
            System.out.println("E seu novo salario e de: "+salnovo);
        }
     }
    }

