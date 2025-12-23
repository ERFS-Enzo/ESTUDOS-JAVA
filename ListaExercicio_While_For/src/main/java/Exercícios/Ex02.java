package Exercícios;
import java.util.Scanner;
public class Ex02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int idade, altura, cont;
        double peso, media, valor, percentagem, calculo2, calculo3;
        
        cont=0;
        valor=0;
        calculo2=0;
        calculo3=0;
        while(cont < 10){
            System.out.println("Informe sua idade: ");           
            idade=scanner.nextInt();
            System.out.println("Informe o peso: ");
            peso=scanner.nextDouble();
            System.out.println("Informe a altura em CM: ");
            
            altura=scanner.nextInt();
            valor = idade + valor;
            cont++; //contar mais 1.
            
            if(peso > 90 && altura < 150){
                calculo2 = calculo2 + 1;
            }
            if(altura > 190){         
                if(idade >=10 && idade <=30){
                    calculo3 = calculo3 + 1;
                }
            }                       
        }        
        media = valor/10;
        percentagem = (calculo3/10)*100;
        
        System.out.println("a media das 10 idades: "+media);
        System.out.println("A quantidade de pessoas com peso maior que 90 e altura inferior a 1,50m: "+calculo2);
        System.out.println("A percentagem de pessoas entre 10 e 30 anos entre as pessoas com mais de 1,90m: "+percentagem);
    }
}