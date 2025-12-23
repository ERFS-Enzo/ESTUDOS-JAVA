package ganhadores;
import java.util.Scanner;
public class ganhadores {
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        double primeiro, segundo, terceiro, valor;
        
        System.out.println("Informe o valor do premio: ");
        valor=scanner.nextDouble();
        primeiro = 0.46 * valor;
        segundo = 0.32 * valor;
        terceiro = 0.22 * valor;
        System.out.println("o primeiro ganhador ganhará: "+primeiro);
        System.out.println("o segundo ganhador ganhará: "+segundo);
        System.out.println("o terceiro ganhador ganhará: "+terceiro);
  }
}
