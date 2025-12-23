package ferraduras02;
import java.util.Scanner;

public class  ferraduras02{
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        int cavalos, ferraduras;
        
       System.out.println("informe a quantidade de cavalos: ");
       cavalos=scanner.nextInt();
       ferraduras = cavalos * 4;
       System.out.println("o total de ferraduras é: "+ferraduras);      
    }
    
}
