package granja_Frangotech;
import java.util.Scanner;

public class granja_Frangotech {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int frangos;
    double chip, anel, VT;       
    System.out.println("Quantos frangos tem: ");
    frangos=scanner.nextInt();
    chip = 4 * frangos;
    anel = 3.50 * (frangos * 2);
    VT= chip + anel;
    System.out.println("O valor total será de: "+VT);
}
}