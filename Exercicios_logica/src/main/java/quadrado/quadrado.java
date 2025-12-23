package quadrado;
import java.util.Scanner;

public class quadrado {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    
        double lado, area;
        System.out.println("Informe o valor do lado: ");
    lado=scanner.nextDouble();
    area= lado * lado;
    System.out.println("A area do quadrado é: "+area);
    }
}
