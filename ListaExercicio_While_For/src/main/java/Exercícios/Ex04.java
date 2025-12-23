package Exercícios;
import java.util.Scanner;
public class Ex04 {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        int idade, cont, idade2;
        double salario, salarionovo, media, maior, menor, calculo3, menorsalario;
        char sexo, sexo2;
        
        System.out.println("Digite sua idade (verdadeira) para iniciar o programa:");
        idade=scanner.nextInt();
        
        cont=0;
        salarionovo=0;
        maior=idade;
        menor=idade;
        calculo3=0;
        idade2=0;
        sexo2=' ';
        menorsalario=0;
        while(idade >= 0){
            System.out.println("Informe sua idade: ");
            idade=scanner.nextInt();
            if(idade < 0) break;
            System.out.println("Informe seu sexo (F/M): ");
            sexo=scanner.next().charAt(0);
            System.out.println("Informe seu salario: ");
            salario=scanner.nextDouble();           
            
            salarionovo = salarionovo + salario;
            if(idade > maior){
                maior= idade;
            }
            if(idade < menor){
                menor = idade;
            }
            
            if(sexo == 'F' && salario <= 200){
                calculo3 = calculo3 + 1;
            }
            
            if(cont==0){
                menorsalario = salario;
                idade2 = idade;
                sexo2 = sexo;
            }
            if(salario < menorsalario){
                menorsalario = salario;
                idade2 = idade;
                sexo2 = sexo;
            }
            cont++;
        }
        media = salarionovo/cont;
        System.out.println("A media dos salarios do grupo: "+media);
        System.out.println("A maior idade: "+maior+" a menor idade: "+menor);
        System.out.println("A quantidade de mulheres com salario ate 200 reais: "+calculo3);
        System.out.println("A pessoa com menor salario tem idade:  "+idade2+" e perntence ao sexo: "+sexo2);
    }
}
