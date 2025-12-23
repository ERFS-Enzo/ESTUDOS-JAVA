package fabrica_acidentes;
import java.util.Scanner;

public class fabrica_acidentes {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int dias;
    double meses, anos;
    
    System.out.println("quantos dias a fabrica está sem acidentes: ");
    dias=scanner.nextInt();
    meses = dias/30.0;
    anos = meses/12.0;
    System.out.println("a fábrica está sem acidentes a: "+dias+" dias");
    System.out.println("a fábrica está sem acidentes a: "+meses+" meses");
    System.out.println("a fábrica está sem acidentes a: "+anos+" anos");
    }
}
