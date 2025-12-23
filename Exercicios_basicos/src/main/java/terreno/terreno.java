package terreno;
import java.util.Scanner;

public class terreno {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double frente, lateral, area;
        System.out.println("informe a medida de frente do terreno: ");
        frente=scanner.nextDouble();
        System.out.println("informe a medida da lateral do terreno: ");
        lateral=scanner.nextDouble();
        area=frente * lateral;
        System.out.println("A medida da area é: "+area);
    }
}
