package br.com.estudos.exceptions;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    //usando exception criado
    public void sacar(double valor) throws SaldoInsuficienteException {

        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        }

        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
    /*
    throw
        Lança a exceção.
        throw new RuntimeException("Erro");
    throws
        Declara que pode lançar.
        public void salvar() throws IOException {
        }
     */
}
