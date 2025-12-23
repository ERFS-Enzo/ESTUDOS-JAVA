package peso_kg_pra_gramas;
import java.util.Scanner;

public class peso_kg_pra_gramas {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
    
        double pesokg, pesog;
        System.out.println("informe o peso em kg: ");
        pesokg=scanner.nextDouble();
        pesog= pesokg*1000;
        System.out.println("o peso em gramas é: "+pesog);
    }
}
