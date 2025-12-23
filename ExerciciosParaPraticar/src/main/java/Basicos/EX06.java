package Basicos;
import java.util.Scanner;
public class EX06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        char operador;
        double n1, n2, resultado;
        
        System.out.println("Digite um numero: ");
        n1=ler.nextDouble();
        System.out.println("Digite um operador [+, -, *, /]: ");
        operador=ler.next().charAt(0);
        System.out.println("Digite outro numero: ");
        n2=ler.nextDouble();
           
        switch (operador){
            case '+': resultado = n1 + n2;
                System.out.println(" "+n1+" + "+n2+" = "+resultado);
                break;
            case '-': resultado = n1 - n2;
                System.out.println(" "+n1+" - "+n2+" = "+resultado);
                break;
            case '*': resultado = n1 * n2;
                System.out.println(" "+n1+" * "+n2+" = "+resultado);
                break;
            case '/': resultado = n1 / n2;
                System.out.println(" "+n1+" / "+n2+" = "+resultado);
                break;
        }
        
    }
}