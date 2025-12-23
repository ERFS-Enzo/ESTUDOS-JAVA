package idade_festa;
import java.util.Scanner;
public class idade_festa {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
        int idade, soma, cont;
        double media;
        
        cont=0;
        soma = 0;
        System.out.println("Informe a idade");
        idade=scanner.nextInt();
        while(idade > 0){
            soma = soma + idade;
            cont++;
            System.out.println("Informe a idade");
            idade=scanner.nextInt();
        }
        media = soma /cont;
        System.out.println("A media: "+media);
    }
}
