package aula_if_else;
import java.util.Scanner;
public class classe_eleitoral {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.printf("Informe sua idade: ");
        idade=scanner.nextInt();
        if(idade <16){
            System.out.println("Nao Votante");   
        } else if(idade >=16 && idade <=17){
            System.out.println("Eleitor Facultativo");
        } else{
            System.out.println("Eleitor Obrigatorio");
        }
}
}
