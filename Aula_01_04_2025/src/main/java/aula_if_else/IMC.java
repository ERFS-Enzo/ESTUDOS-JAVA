package aula_if_else;
import java.util.Scanner;
public class IMC {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        double peso, altura, IMC;
        System.out.println("Informe seu peso: ");
        peso=scanner.nextDouble();
        System.out.println("Informe sua altura: ");
        altura=scanner.nextDouble();
        IMC = peso/(altura * altura);
        if (IMC < 20){
            System.out.println("Abaixo do peso");
        } else if(IMC >=20 && IMC <=25){
            System.out.println("Peso normal");
        } else if(IMC >=25 && IMC <=30){
            System.out.println("Sobre peso");
        } else if(IMC >=30 && IMC <=40){
            System.out.println("Obeso");
        } else if(IMC > 40){
            System.out.println("Obeso Morbido");
        }
        System.out.println("O IMC e: "+IMC);
    }
}
