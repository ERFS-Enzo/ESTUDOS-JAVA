package br.com.estudos.threads_runnable;

public class EnviarEmail implements Runnable{
    @Override
    public void run(){
        System.out.println("Enviando Email...");
    }
}
