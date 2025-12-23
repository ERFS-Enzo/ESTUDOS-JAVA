package salario_aumento_desconto;
import java.util.Scanner;

public class salario_aumento_desconto {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double salario, salarioaumento, salariofinal; 
        
        System.out.println("insira o salario inicial: ");
        salario=scanner.nextDouble();
        salarioaumento = salario * 1.15;
        salariofinal = salarioaumento * 0.92;
        System.out.println("O salario inicial é de: "+salario);
        System.out.println("O salario com aumento é de: "+salarioaumento);
        System.out.println("O salario final é de: "+salariofinal);
    }
}
