package br.com.estudos.datas;

import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class MainDatas {
    public static void main(String[] args) {
        /*
        date representa data e hora
            Problemas da classe Date:
            -Metodos confusos, Muitos metodos depreciados, dificil de manipular, nao é mutavel
         */
        Date agora = new Date();
        System.out.println(agora);

        /*
        Calendar surgiu para tentar corrigir o Date.
            permite: somar datas, pegar dia/mes/ano,  configurar horários
            quando usar date e calendar: Manutenção de sistemas antigos, APIs legadas

            obs: mes começa em 0
         */
        Calendar cal = Calendar.getInstance();

        cal.set(2026, Calendar.JANUARY, 10);

        System.out.println(cal.getTime());

        //manipulando datas com calendar
        //somar dias
        cal.add(Calendar.DAY_OF_MONTH, 5);
        //pegar partes da data
        int ano = cal.get(Calendar.YEAR);
        int mes = cal.get(Calendar.MONTH); // começa em 0
        //comparando date
        Date d1 = new Date();
        Date d2 = new Date();

        d1.before(d2);
        d1.after(d2);

        /*
        ficam na pasta java.time: LocalDate, LocalTime, LocalDateTime, OffsetDateTime, OffsetTime
            todas são: imutaveis, claras, seguras, bem pensadas
         */

        //LocalDate: só data, sem hora, usado em aniversarios , vencimentos, feriados
        LocalDate aniversario = LocalDate.of(2000, 5, 10);

        System.out.println(aniversario);
        //LocalTime: só hora, sem data, usado em horarios de abertura e fechamento
        LocalTime horario = LocalTime.of(14, 30);

        System.out.println(horario);
        //LocalDateTime: data + hora, sem fuso horario, usado em eventos Locais
        LocalDateTime evento = LocalDateTime.of(2026, 1, 10, 14, 30);
        //OffsetDateTime: hora + data + fuso(offset UTC), usado em APIs, logs, Sistemas distribuidos
        OffsetDateTime data = OffsetDateTime.parse("2026-01-10T14:30:00-03:00");
        //OffsetTime: hora + fuso, usado mais pra horarios globais
        OffsetTime hora = OffsetTime.now();

        //Operações com datas
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);

        hoje.minusMonths(1);

        //Comparar datas
        hoje.isBefore(amanha);
        hoje.isAfter(amanha);

        //Convertendo para Strings (formatar)
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = hoje.format(formatter);

        //Parse (String -> data)
        LocalDate data_ = LocalDate.parse("10/01/2026", formatter);

        //Conversão entre tipos
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt = ldt.toLocalTime();

    }
}