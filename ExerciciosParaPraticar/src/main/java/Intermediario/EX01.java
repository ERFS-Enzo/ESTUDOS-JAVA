package Intermediario;
import java.util.Scanner;
public class EX01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
              
        System.out.println("Insira no nome do aluno: ");
        String nome = ler.nextLine();
        System.out.println("Informe a primeira nota de "+nome+":");
        double nota1=ler.nextDouble();
        System.out.println("Informe a segunda nota de "+nome+":");
        double nota2=ler.nextDouble();
        System.out.println("Informe a terceira nota de "+nome+":");
        double nota3=ler.nextDouble();
               
        if(nota1 > 10 || nota2> 10 || nota3> 10){
            System.out.println("ALGUMA NOTA FOI MAIOR QUE 10");
            System.out.println("DESCONSIDERE A SITUAÇÃO ABAIXO");
        }
        
        double media = (nota1 + nota2 + nota3)/3;
        
        System.out.printf("SITUAÇÃO: ");
        if(media >= 7){
            System.out.printf("APROVADO");
        } else if(media >= 5 && media <= 6.9){
            System.out.printf("RECUPERAÇÃO");
        } else{
            System.out.printf("REPROVADO");
        }
    } 
}
