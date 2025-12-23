package Maior_Menor;
import java.util.Scanner;
public class Qual_maior_menor_numero {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        int idade, maior, menor;
        double altura, alturaVe, alturaNo;       
        System.out.println("Informe a idade: ");
        idade=scanner.nextInt();  
        System.out.println("Informe a altura: ");
        altura=scanner.nextDouble();       
        maior=idade;
        menor=idade;    
        alturaVe=altura;
        alturaNo=altura;
        while(idade >= 0 && altura > 0){
            if(idade > maior){
                maior = idade;
                alturaVe = altura;
            }
            if(idade < menor){
                menor = idade;
                alturaNo = altura;
            }
            System.out.println("Informe uma idade, ou numero negativo para parar");
            idade=scanner.nextInt();
            System.out.println("Informe a altura, ou numero (0) para parar:");
            altura=scanner.nextDouble();
        }
            
            System.out.println("A idade do mais velho: "+maior);
            System.out.println("A altura do mais velho: "+alturaVe+"m");
            System.out.println("A idade do mais novo: "+menor); 
            System.out.println("A altura do mais novo: "+alturaNo+"m");
    }
}
