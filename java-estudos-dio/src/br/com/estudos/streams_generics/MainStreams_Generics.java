package br.com.estudos.streams_generics;

import java.util.ArrayList;
import java.util.List;

public class MainStreams_Generics {
    public static void main(String[] args) {
        /*
        Generics dizem o tipo que a classe vai trabalhar.
            Usado em collections, Reutilização, Segurança de tipos
         */
        Caixa<String> caixa = new Caixa<>();
        caixa.guardar("Java");

        System.out.println(caixa.pegar());

        Util.imprimir(10);
        Util.imprimir("Java");

        /*
        Stream é uma forma de processar dados de Collections, nao altera a coleção principal.
            ele consegue filtrar, transformar, ordenar, reduzir
            Operações mais usadas:
            - .filter(n -> n > 10), .map(n -> n * 2), .forEach(System.out::println);
            operações mais comuns:
            toList(), count(), findFirst(), anyMatch(), allMatch()

            Quando usar: leitura clara, transformação de dados
         */

        //forma antiga sem streams
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);

        List<Integer> pares1 = new ArrayList<>();

        for (Integer n : numeros) {
            if (n % 2 == 0) {
                pares1.add(n);
            }
        }

        System.out.println(pares1);

        //com streams
        List<Integer> pares2 = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();


        //Streams com objeto
        List<String> nomes = List.of("Ana", "João", "Pedro");

        nomes.stream()
                .filter(n -> n.startsWith("J"))
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}