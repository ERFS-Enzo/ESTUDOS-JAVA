package br.com.estudos.lambda;

public interface Notificacao {
    //Só pode ter UM metodo abstrato. Metodos default não contam
    void enviar(String mensagem);
}
