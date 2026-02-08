package br.com.estudos.exceptions;

public class MainExceptions {
    public static void main(String[] args) {
        /*
        Exception é um erro que acontece em tempo de execução.
            Por que Exceptions existem?
                Evitar travamentos inesperados
                Controlar falhas
                Informar erros corretamente
                Manter o sistema estável
            Hierarquia das Exceptions:
                Throwable
                 ├── Error
                 └── Exception
                     ├── RuntimeException
                     └── Checked Exception
         */

        /*
        ERROR(nao trate), erros graves da jvm:
                OutOfMemoryError
                StackOverflowError
        */

        /*
        Checked Exception, Obrigam tratamento.
                FileReader reader = new FileReader("arquivo.txt");
                o codigo acima nao compila sem try/catch
         */

        /*
        RuntimeException (Unchecked), Não obrigam tratamento.
                NullPointerException
                IndexOutOfBoundsException
                ArithmeticException
         */

        //Tratando exceções com Try / catch
        try {
            int resultado = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão");
        }

        //multiplos catch
        try {
            // código
        } catch (NullPointerException e) {
            // trata
        } catch (Exception e) {
            // genérico
        }

        //finally
        finally {
            System.out.println("Finalizando");
        }

        //usando classe contabancaria
        ContaBancaria conta = new ContaBancaria(100);

        try {
            conta.sacar(150);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Programa continua");


    }
}