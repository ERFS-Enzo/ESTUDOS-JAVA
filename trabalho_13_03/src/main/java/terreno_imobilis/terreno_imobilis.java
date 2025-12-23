package terreno_imobilis;
import java.util.Scanner;

public class terreno_imobilis {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        double lateral, frente, area;
        
       System.out.println("Informe o tamanho da lateral: ");
       lateral=scanner.nextDouble();
       System.out.println("informe o tamanho da frente: ");
       frente=scanner.nextDouble();
       area= lateral * frente;
       System.out.println("a area é: "+area);      
    }
    
}
