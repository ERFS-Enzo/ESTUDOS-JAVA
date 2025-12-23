package Tabuada;
import java.util.Scanner;
public class Tabuada {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numero, resultado, i;
        System.out.println("Informe o numero da tabuada: ");
        numero=scanner.nextInt();
        for(i=0; i<=10; i++){
            resultado = numero * i;
            System.out.println(numero+" x "+i+ "= "+resultado);
        }
        System.out.println("Fim da Tabuada.");
    }
}
