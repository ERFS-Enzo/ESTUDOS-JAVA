package Exercícios;
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, i, quantidade, altura, cont;
        double peso, calculo1, calculo2, calculo3, calculo4, media, percentagem;
        char olho, cabelo;
       
        calculo1=0;
        calculo2=0;
        calculo3=0;
        calculo4=0;
        cont=0;
        quantidade=0;
        
        for(i=0; i < 20; i++){
            System.out.println("Informe a idade: ");
            idade=scanner.nextInt();
            System.out.println("Informe seu peso: ");
            peso=scanner.nextDouble();
            System.out.println("Informe sua altura em (cm): ");
            altura=scanner.nextInt();
            System.out.println("Informe a inicial da cor do olho: ");
            olho=scanner.next().charAt(0);
            System.out.println("Informe a inicial da cor do cabelo: ");
            cabelo=scanner.next().charAt(0);       
            if(idade > 50 && peso < 60){
                calculo1 = calculo1 + 1;                
            } 
            if(altura < 150){
                calculo2 = idade + calculo2;
                cont = cont +1;     //contar mais um 
            }
            if(olho == 'A'){
                calculo3 = calculo3 + 1;
                
            }
            if(cabelo == 'R' && olho != 'A'){
                calculo4 = quantidade + calculo4;
            }
        }
        
        media = calculo2/cont;
        percentagem= (calculo3/20)*100;
        
        System.out.println("Pessoas acima de 50 anos e abaixo de 60kg: "+calculo1);
        System.out.println("Media das idades de pessoas com altura inferior a 1,50: "+media);
        System.out.println("A percentagem de pessoas com olhos azuis entre todas as pessoas: "+percentagem);
        System.out.println("A quantidade de pessoas ruivas que nao possuem olhos azuis: "+calculo4);
    }
}
