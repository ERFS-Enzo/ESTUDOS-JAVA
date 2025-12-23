package raio;
import java.util.Scanner;

public class raio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); 
        double raio, comprimento, area, volume;
        System.out.println("informe o raio: ");
        raio=scanner.nextDouble();
        comprimento= 2 * 3.14 * raio;
        area= 3.14 * (raio*raio);
        volume= (4.0/3.0) * 3.14 * (raio*raio*raio);
        System.out.println("o valor do comprimento é: "+comprimento);
        System.out.println("o valor da area é: "+area);
        System.out.println("o valor do volume é: "+volume);
    }
    
}
