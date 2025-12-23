package salario;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       double vendas, salario, salariof, comissao;
       
      System.out.println("Insira o salario fixo: ");
      salario=scanner.nextDouble();
      System.out.println("Insira o valor de vendas: ");
      vendas=scanner.nextDouble();
      comissao= vendas * 0.04;
      salariof= salario + comissao;
     System.out.println("O valor do salario final é: "+salariof);
    }
}
