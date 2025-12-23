package idade;
import java.util.Scanner;

public class idade {
 public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in); 
    
        int anonasc, anoatual, anos, meses, dias;
        System.out.println("Informe o ano de nascimento: ");
        anonasc=scanner.nextInt();
        System.out.println("Informe o ano atual: ");
        anoatual=scanner.nextInt();
        anos= anoatual - anonasc;
        meses= anos * 12;
        dias= anos * 365;
        System.out.println("a idade em anos é: "+anos);
        System.out.println("a idade em meses é: "+meses);
        System.out.println("a idade em dias é: "+dias);
 }   
}
