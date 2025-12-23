package trapezio;
import java.util.Scanner;

public class trapezio {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
    double baseMa, baseMe, area,altura;
    System.out.println("Informe o valor da base maior: ");
    baseMa=scanner.nextDouble();
    System.out.println("Informe o valor da base menor: ");
    baseMe=scanner.nextDouble();
    System.out.println("informe a altura: ");
    altura=scanner.nextDouble();
    area=((baseMa + baseMe)*altura)/2;
    System.out.println("A area do trapezio é: "+area);
    }
}
