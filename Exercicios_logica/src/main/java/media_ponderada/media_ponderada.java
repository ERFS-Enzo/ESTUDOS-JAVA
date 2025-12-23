package media_ponderada;
import java.util.Scanner;

public class media_ponderada {
     public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        double n1, n2, mp;
        int p1= 2, p2=3;
        System.out.println("Insira a primeira nota: ");
        n1=scanner.nextDouble();
        System.out.println("Insira a segunda nota: ");
        n2=scanner.nextDouble();
        mp= (n1*p1)+(n2*p2)/(p1+p2);
        System.out.println("A media ponderada das notas é: "+mp);
    }
}
