package br.com.estudos.interfaces;

public class MainInterfaces {
    public static void main(String[] args) {
        Pagamento pagamento1 = new CartaoCredito();
        Pagamento pagamento2 = new Pix();

        pagamento1.pagar(100);
        pagamento2.pagar(50);
        pagamento1.imprimirRecibo();
    }
}