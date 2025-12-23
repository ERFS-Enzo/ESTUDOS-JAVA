package Media;
import java.util.Scanner;

public class media {
   public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       
    double nota1, nota2,media;
    System.out.println("Informe a primeira nota: ");
    nota1=scanner.nextDouble();
    System.out.println("Informe a segunda nota: ");
    nota2=scanner.nextDouble();
    media=(nota1 + nota2)/2;
    System.out.println("A media das notas é: "+media);
    
   } 
}
