package aula_if_else;
import java.util.Scanner;
public class diferença_maior_menor {
    public static void main (String[] args){
    Scanner scanner = new Scanner (System.in);
    int n1,n2;
    double diferenca;
        System.out.println("Informe o primeiro numero: ");
        n1=scanner.nextInt();
        System.out.println("Informe o segundo numero: ");
        n2=scanner.nextInt();
        if (n1 > n2){
        diferenca = n1 - n2;
            System.out.println("A diferenca é de: "+diferenca+ " e o maior numero e o primeiro");
        } else if(n2 > n1){
            diferenca = n2 - n1;
            System.out.println("A diferenca e de: "+diferenca+ " e o maior numero e o segundo");
        } else{
            System.out.println("Os numeros sao iguais");
        }
    }
}
