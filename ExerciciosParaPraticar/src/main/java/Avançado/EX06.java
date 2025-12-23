package Avançado;
import java.util.Scanner;
public class EX06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        double celcius, Fahrenheit, km, milha, reais, dolar;
        
        System.out.println("Ecolha qual conversão deseja usar: ");
        System.out.println("1-  Converter Celsius para Fahrenheit");
        System.out.println("2 - Converter Quilômetros para Milhas");
        System.out.println("3 - Converter Reais para Dólares (valor do dólar fixo)");
        System.out.println("0 - Sair");
        int escolha=ler.nextInt();
        
        switch (escolha){
            case 1: System.out.printf("Digite a temeperatura em celcius: ");
                celcius=ler.nextDouble();
                Fahrenheit = (celcius * 1.8) + 32;
                System.out.println("A temperatura em Fahrenheit será: "+Fahrenheit);
                break;
                
            case 2: System.out.printf("Digite a distancia em KM: ");
                km=ler.nextDouble();
                milha = km/1.609;
                System.out.println("A distancia em Milhas: "+milha);
                break;
            case 3: System.out.println("Digite o valor em reais: ");
                reais=ler.nextDouble();
                dolar = reais * 5.55;
                System.out.println("O valor em Dolares será: "+dolar);
                break;
            case 0: System.out.println("Obrigado! Até logo!!");
                break;
            default: System.out.println("Numero invalido");
                break;
        }
        
    }
}
