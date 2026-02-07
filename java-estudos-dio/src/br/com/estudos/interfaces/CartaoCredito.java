package br.com.estudos.interfaces;

public class CartaoCredito implements Pagamento{
    @Override
    public void pagar(double valor){
        System.out.println("Pagando R$ "+ valor+" com cartão de credito");
    }
}
