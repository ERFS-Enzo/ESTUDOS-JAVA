package curso.tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        System.out.println("Insira a idade do aluno: ");
        int idade = ler.nextInt();
        System.out.println("Digite a nota do aluno: ");
        float nota = ler.nextFloat();
        
        System.out.printf("A nota do %s que tem %d anos é %.1f\n", nome, idade, nota);
        
        //System.out.println("A nota do "+ nome+ " é: "+nota);     
        //System.out.format("A nota do %s é %.2f\n", nome, nota);
    }
}
