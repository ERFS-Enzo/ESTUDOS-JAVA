package losango;
import java.util.Scanner;

public class losango {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); 
    
        double area, dmaior, dmenor;
        System.out.println("Informe o valor da diagonal maior: ");
        dmaior=scanner.nextDouble();
        System.out.println("Informe o valor da diagonal menor: ");
        dmenor=scanner.nextDouble();
        area=(dmaior * dmenor)/2;
        System.out.println("A area do losango é: "+area);
    } 
    
}
