package Exercícios;
import java.util.Scanner;
public class Ex03 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double salario, total_filho, salarionovo, media_salario, media_filho, maior, calculo4, percentagem;
        int  filhos, cont;
        
        filhos=0;
        total_filho=0;
        salario=0;
        salarionovo=0;
        maior=0;
        calculo4=0;
        cont=0;
        while(salario >=0 && filhos >= 0){
            System.out.println("Informe seu salario: ");
            salario=scanner.nextDouble();
            if(salario < 0) break; //o break serve para finalizar caso nao corresponda a condição.
            System.out.println("Quantos filhos voce tem? R:");
            filhos=scanner.nextInt();
            if(filhos < 0) break;
            
            salarionovo = salarionovo + salario;   
            total_filho += filhos; //+= significa que vai somar total_filho com filhos.
            if(salario > maior){
                maior = salario;
            }
            
            if(salario <= 150){
                calculo4 = calculo4 + 1;
            }
            cont = cont + 1;
                        
        }
        media_salario = salarionovo/cont;
        media_filho = total_filho/cont;
        percentagem= (calculo4/cont)*100;
        
        System.out.println("A media salarial da populacao: "+media_salario);
        System.out.println("A media de filhos da populacao: "+media_filho);
        System.out.println("O maior salario: "+maior);
        System.out.println("A percentagem de pessoas com salario ate 150 reais: "+percentagem);
    }
}
