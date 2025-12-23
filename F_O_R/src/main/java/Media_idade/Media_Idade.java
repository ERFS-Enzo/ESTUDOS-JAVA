package Media_idade; 
import java.util.Scanner;
   public class Media_Idade {
       public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        double media;
        int idade, cont, qntidade;
        cont = 0;
        System.out.println("Informe quantas idades serao informadas: ");
        qntidade=scanner.nextInt();
        for(int c=1; c<=qntidade;c++){
            System.out.println("Informe a idade: ");
            idade=scanner.nextInt();
            cont = cont + idade;
        }
        media = cont / qntidade;
        System.out.println("A media é: "+media);
        scanner.close();
    }
}
