package br.com.estudos.threads_runnable;

public class MainThreads_Runnable {
    public static void main(String[] args) {

        /*
        Thread é uma linha de execução.
            Normalmente: Seu programa executa uma coisa por vez
            Com threads: Pode executar várias coisas ao mesmo tempo
            Exemplo do mundo real: Um caixa atendendo ou Vários caixas atendendo ao mesmo tempo

            Quando usar: Tarefa pesada, Paralelismo

            Runnable + threads + lambda = forma moderna básica
         */

        //Runnable é uma interface funcional do metodo run()

        Runnable tarefa = new EnviarEmail();

        Thread thread1 = new Thread(tarefa);
        thread1.start();

        //com lambda
        Thread thread2 = new Thread(() -> {
            System.out.println("Executando em paralelo");
        });

        thread2.start();

        /*
        Metodos importantes com thread:
            thread.start();   // inicia
            thread.sleep(1000); // pausa
            thread.join();    // espera terminar
        */

        //nomeando threads
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
        });

        t.setName("Thread-Email");
        t.start();
    }
}