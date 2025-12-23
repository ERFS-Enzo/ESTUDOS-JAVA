package aula_if_else;
import java.util.Scanner;
public class trabalho {
    public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    int idade, dose, ml, gotas;
    double peso;
        dose = 0;
        System.out.println("Informe sua idade: ");
        idade=scanner.nextInt();
        System.out.println("Informe seu peso em KG: ");
        peso=scanner.nextDouble();
        if(idade >= 12){
            if (peso >= 60){
            dose = 1000;
        } else {
            dose = 875;
        }
        } else {
            if(peso > 5 && peso <= 9){
                dose = 125;
            }else if (peso > 9 && peso <= 16) {
                dose = 250;
            } else if (peso > 16 && peso <= 24) {
                dose = 375;
            } else if (peso > 24 && peso <= 30) {
                dose = 500;
            } else if (peso > 30) {
                dose = 750;
            } else {
                System.out.println("Peso invalido");
            }
        }
        ml = dose / 500;
        gotas = ml * 20;
        System.out.println("Dosagem recomendada: "+dose+" mg");
        System.out.println("Quantidade de gotas por dose: "+gotas);
    }
}
