package Exercícios;
import java.util.Scanner;
public class Ex06 {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        int idade, total_idade, cont;
        double media;
        
        total_idade=0;
        cont=0; // nao vai ser 1 pq o [0] para encerrar vai contar como 1
        
        System.out.println("Informe sua idade: ");
        idade=scanner.nextInt();
        total_idade = total_idade + idade;
        while(idade > 0){
            System.out.println("Informe sua idade [0] para parar: ");
            idade=scanner.nextInt(); 
            
            total_idade = total_idade + idade;
            cont++;
        }
        
        media = total_idade/cont;
        
        System.out.println("A media das idade vai ser: "+media);
    }
}
