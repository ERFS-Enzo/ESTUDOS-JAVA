package br.com.estudos.lambda;

import java.util.function.Predicate;

public class MainLambda {
    public static void main(String[] args) {
    //Lambda é uma forma curta de implementar uma interface que tem apenas UM metodo.
    //Lambda nao precisa criar uma classe, implementamos o metodo direto na main
        Notificacao email = (mensagem) -> {
            System.out.println("Enviando email: "+mensagem);
        };
        email.enviar("Olá");

        //simplificando mais:
        Notificacao sms = mensagem -> System.out.println("Enviando SMS: "+mensagem);

        //lambda com retorno, nao precisa escrever "return"
        Desconto desconto10 = valor -> valor * 0.9;
        System.out.println(desconto10.calcular(100d));

        //Java tem varias interfaces prontas:
        /*
         Classe: Runnable ; Metodo: run() ; Uso: Threads.
         Classe: Comparator<T> ; Metodo: compare() ; Uso: Ordenação.
         Classe: Predicate<T> ; Metodo: test() ; Uso: true/false.
         Classe: Function<T, R> ; Metodo: apply() ; Uso: transforma.
         Classe: Consumer<T> ; Metodo: accept() ; Uso: consome.
        */
        Predicate<Integer> maiorDeIdade = idade -> idade >= 18;


    }
}