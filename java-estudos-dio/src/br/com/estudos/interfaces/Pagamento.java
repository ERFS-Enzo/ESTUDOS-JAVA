package br.com.estudos.interfaces;

public interface Pagamento {

    void pagar(double valor);

    default void imprimirRecibo(){
        System.out.println("Recibo impresso");
    }
    /*
    A Interface em java só possui logica se for com default, se nao só somente pra contrato.
    Pode haver várias interfaces.
    */
}
