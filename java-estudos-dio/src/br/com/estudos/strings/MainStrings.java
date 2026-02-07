package br.com.estudos.strings;

public class MainStrings {
    public static void main(String[] args) {
        /*
        String representa texto no java, é um objeto, nao é primitivo, é imutavel
            Comparar String com .equals()
        */
        //Metodos importantes de String:
        String texto = " Java é poderoso ";

        texto.length();
        texto.trim();
        texto.toUpperCase();
        texto.toLowerCase();
        texto.contains("Java");
        texto.replace("Java", "Kotlin");
        texto.substring(0, 4);

        /*
        StringBuilder é uma String que pode mudar, ou seja, mutavel
            Usar quando: o texto muda muito, em loops, montagem de mensagem, performance importa
        */
        StringBuilder sb = new StringBuilder();

        sb.append("Java");
        sb.append(" é");
        sb.append(" rápido");

        System.out.println(sb.toString());

        /*
        StringBuffer é igual ao StringBuilder mas tem thread-safe e é mais lento
        Quando usar: Multithreads e segurança > performance
        */
        StringBuffer sbf = new StringBuffer();
    }
}