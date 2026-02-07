package br.com.estudos.wrappers;

import java.util.ArrayList;
import java.util.List;

public class MainWrappers {
    public static void main(String[] args) {
        //Tipos primitivos e Wrappers
        /*
        Tipos primitivos são valores simples, diretos, rápidos.
            int, double, float, char, long, byte, boolean, short
            Problema dos tipos primitivos:
            -nao tem metodos, nao funcionam com Generics, nao entram em collections
            ex: List<int> numeros; nao funciona
        */
        /*
        Wrapper é a versão objeto do tipo primitivo.
            Integer, Double, Boolean, Character, Long, Float, Byte, Short
            List<Integer> numeros; Agora funciona
            Wrapper pode ser null, primitivo nao
        */
        List<Integer> idades = new ArrayList<>();

        idades.add(20);
        idades.add(30);

        System.out.println(idades);

        //Autoboxing e Unboxing: primitivo -> Wrapper; Wrapper -> primitivo
        Integer numero = 10;
        int valor = numero;

        //Wrapper tem metodos úteis
        System.out.println(numero.compareTo(5));
        System.out.println(Integer.parseInt("20"));

        Boolean ativo = Boolean.parseBoolean("true");

        //Nao da pra comparar Wrappers com == , se usa .equals()
        Integer a = 100;
        Integer b = 100;
        System.out.println(a.equals(b));

    }
}