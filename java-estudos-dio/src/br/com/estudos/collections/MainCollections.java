package br.com.estudos.collections;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
        //Collections são estruturas para guardar vários dados juntos.
        //List, Set, Map
        List<String> lista = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        /*
        List: lista ordenada
            Mantem ordem, aceita elementos repetidos, acessa por indice
            Implementação mais comum: ArrayList
            Quando usar: Ordem importa, Pode repetir, Acesso por posição
        */
        List<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("João");
        nomes.add("Ana");

        System.out.println(nomes);
        System.out.println(nomes.get(0));

        /*
        Set: Conjunto (sem repetição)
            NÃO aceita duplicados (ignora), NÃO garante ordem (geralmente), rápido para verificar existência
            Implementação comum: HashSet
            Quando usar: nao pode repetir, nao importa a ordem, verificar existencia rapido
        */
        Set<String> emails = new HashSet<>();

        emails.add("a@email.com");
        emails.add("b@email.com");
        emails.add("a@email.com");

        System.out.println(emails);

        /*
        Map: chave e valor
            guarda pares chave → valor, chave é única, valor pode repetir
            Implementação comum: HashMap
            Quando usar: buscar dados como id, onde a ordenação nao é crucial
        */
        Map<String, Integer> idades = new HashMap<>();

        idades.put("Ana", 20);
        idades.put("João", 30);
        idades.put("Ana", 25);

        System.out.println(idades);
        System.out.println(idades.get("Ana"));

        /*
        percorrendo collections:
        -List e Set
        for (String nome : nomes) {
            System.out.println(nome);
        }
        -Map
        for (String chave : idades.keySet()) {
            System.out.println(chave + " - " + idades.get(chave));
        }
        */

    }
}