package br.com.estudos.exceptions;

public class SaldoInsuficienteException extends Exception {

    //criando a propria exception
    public SaldoInsuficienteException(String msg) {
        super(msg);
    }

}