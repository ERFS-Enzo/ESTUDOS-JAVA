package Avançado;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[] usuario = new String[3];
        String[] senha = new String[3];
        
        System.out.println("REGISTRE-SE");
        for(int i = 0; i < 3; i++) {
            System.out.println("Digite seu nome de usuario: ");
            usuario[i] = ler.next();
            System.out.println("Digite sua senha " + usuario[i] + ": ");
            senha[i] = ler.next();                      
        }
        
        System.out.println("\nREALIZAR LOGIN");
        boolean loginSucesso = false;
        int tentativas = 0;
        
        while(tentativas < 3 && !loginSucesso) {
            System.out.println("Insira o seu nome de usuario: ");
            String nome = ler.next();
            System.out.println("Digite sua senha: ");
            String password = ler.next();
            
            for(int i = 0; i < 3; i++) {
                if(nome .equals(usuario[i]) && password.equals(senha[i])){ // o .equals() serve para comparar strings
                    loginSucesso = true;
                    break;
                }
            }
            
            if(loginSucesso) {
                System.out.println("Bem vindo " + nome + "!!");
            } else {
                tentativas++;
                System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + (3 - tentativas));
            }
        }
        
        if(!loginSucesso) {
            System.out.println("Você excedeu o número máximo de tentativas. Acesso bloqueado.");
        }
        
        ler.close();
    }
}