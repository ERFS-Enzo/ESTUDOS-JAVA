package peso_pessoa;
import java.util.Scanner;

public class peso_pessoa {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        double peso, peso15, peso20;
        System.out.println("infome o peso: ");
        peso=scanner.nextDouble();
        peso15= peso * 1.15;
        peso20= peso * 1.20;
        System.out.println("O peso se a pessoa engordar 15% é de:"+peso15);
        System.out.println("O peso se a pessoa engordar 20% é de: "+peso20);
    }
}
