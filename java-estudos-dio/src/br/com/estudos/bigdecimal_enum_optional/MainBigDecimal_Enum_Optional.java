package br.com.estudos.bigdecimal_enum_optional;

import java.math.BigDecimal;
import java.util.Optional;

public class MainBigDecimal_Enum_Optional {
    public static void main(String[] args) {
        /*
        BigDecimal representa números decimais com precisão total.
            Usado para dinheiro, calculos financeiros, Sistemas bancários
            Sempre use String
            Operações: add, subtract, multiply, divide
            Comparar: a.compareTo(b);
        */
        BigDecimal a = new BigDecimal("10.00");
        BigDecimal b = new BigDecimal("2.50");

        BigDecimal total = a.add(b);

        System.out.println(total);

        /*
        ENUM representa um conjunto fixo de valores.
            Enum compara com ==
         */
        Status status = Status.ATIVO;

        if (status == Status.ATIVO) System.out.println("Usuário ativo");

        /*
        Optional representa um valor que pode ou não existir.
            Usar quando tiver Retorno de métodos
         */
        Optional<String> nome = Optional.of("Enzo");
        Optional<String> vazio = Optional.empty();

        nome.ifPresent(n -> System.out.println(n));
        String valor = nome.orElse("Padrão");

    }
}