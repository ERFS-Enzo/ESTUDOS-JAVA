package Basicos;
import java.util.Scanner;
public class EX01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int idade;
        
        System.out.println("Informe sua idade: ");
        idade = ler.nextInt();
        if(idade >= 18 && idade < 60){
            System.out.println("Vc é maior de idade");
        } else if(idade < 18 && idade >= 1){
            System.out.println("Vc é menor de idade");
        } else if(idade <= 0){
            System.out.println("Idade invalida");
        } else{
            System.out.println("Vc é um idoso(a)");
        }
        
    }
}
