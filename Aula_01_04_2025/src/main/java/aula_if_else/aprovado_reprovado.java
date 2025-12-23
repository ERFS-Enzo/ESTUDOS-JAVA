package aula_if_else;
import java.util.Scanner;

public class aprovado_reprovado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Informe a nota 1: ");
        nota1=scanner.nextDouble();
        System.out.println("Informe a nota 2: ");
        nota2=scanner.nextDouble();
        media = (nota1 + nota2)/2;
        System.out.println("O valor da media: "+media);
        if(media >=7){
            System.out.println("Aprovado");
        } else if(media>=5 && media<7){
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
        }      
    }
