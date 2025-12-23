package Avançado;
import java.util.Scanner;
public class EX01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        double imposto=0, renda;
        
        System.out.println("CALCULO DE IMPOSTO DE RENDA");
        System.out.println("Informe sua renda mensal em R$: ");
        renda=ler.nextDouble();
        
        if(renda <= 2000){
            System.out.println("Isento");
        } else if(renda > 2000 && renda <= 3000){
            imposto = renda * 8 / 100;
        } else if(renda > 3000 && renda <=4500){
            imposto = renda * 18 / 100;          
        } else if(renda > 4500){
            imposto = renda * 28 / 100;
        } else{
            System.out.println("Numero inválido");
        }
        
        System.out.println("Seu imposto de renda é de R$"+imposto);
    }
}
