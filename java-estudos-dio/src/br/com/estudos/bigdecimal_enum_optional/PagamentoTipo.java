package br.com.estudos.bigdecimal_enum_optional;

public enum PagamentoTipo {
    //Enum com atributos
    PIX(0),
    CARTAO(5);

    private int taxa;

    PagamentoTipo(int taxa) {
        this.taxa = taxa;
    }

    public int getTaxa() {
        return taxa;
    }
}
