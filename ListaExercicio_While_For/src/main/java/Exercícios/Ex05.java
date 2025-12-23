package Exercícios;
import java.util.Scanner;
public class Ex05 {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        int cont, num, candidato1, candidato2, candidato3, candidato4;
        double percentagem_nulo, percentagem_branco, nulo, branco;
        
        cont=0;
        num=7;
        candidato1=0;
        candidato2=0;
        candidato3=0;
        candidato4=0;
        nulo=0;
        branco=0;
        while(num>0){
            System.out.println("Digite seu voto [1 a 6] ou [0] para parar: ");
            num=scanner.nextInt();
            if(num == 0) break;
           
            if(num == 1){
                candidato1 = candidato1 + 1;
            } else if(num == 2){
                candidato2 =  candidato2 + 1;
            } else if(num ==3){
                candidato3 = candidato3 + 1;             
            } else if(num == 4){
                candidato4 = candidato4 +1;                
            } else if(num == 5){
                nulo = nulo + 1;
            } else if(num == 6){
                branco = branco + 1;
            }
            cont++;
        }
        
        percentagem_nulo = (nulo/cont)*100;
        percentagem_branco = (branco/cont)*100;
                
        System.out.println("O total de votos do 1º ao 4º candidato respectivamente: "
        +candidato1+" "+candidato2+" "+candidato3+" "+candidato4);
        System.out.println("O total de votos nulos: "+nulo);
        System.out.println("O total de votos brancos: "+branco);
        System.out.println("A percentagem de votos nulos sobre o total de votos: "+percentagem_nulo);
        System.out.println("A percentagem de votos brancos sobre o total de votos: "+percentagem_branco);
    }
}
