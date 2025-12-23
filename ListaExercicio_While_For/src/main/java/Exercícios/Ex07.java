package Exercícios;
import java.util.Scanner;
public class Ex07 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        double num;
        int cont, cont2, i;
        
        cont=0;
        cont2=0;
        for(i=0; i < 10; i++){
            System.out.println("Digite um numero: ");
            num=scanner.nextDouble();
            
            if(num >= 10 && num <=20){
                cont = cont + 1;
            } else{
                cont2 = cont2 + 1;
            }                      
        }
        System.out.println("Tem "+cont+" Numeros dentro do intervalo [10,20]");
        System.out.println("Tem "+cont2+" Numeros fora do intervalo [10,20]");
    }
}
