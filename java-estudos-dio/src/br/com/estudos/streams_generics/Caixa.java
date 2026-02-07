package br.com.estudos.streams_generics;

public class Caixa<T>{
    //T é um tipo genérico (pode ser qualquer um).
    private T valor;

    public void guardar(T valor) {
        this.valor = valor;
    }

    public T pegar() {
        return valor;
    }
}
