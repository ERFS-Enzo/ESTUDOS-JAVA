import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Equipe> equipes = new HashMap<>();

        Equipe alpha = new Equipe("Alpha");
        alpha.adicionar(new ConsultorDados("Lucas", "Pleno"));
        alpha.adicionar(new ConsultorBackend("Bruno", "Senior"));
        alpha.adicionar(new ConsultorFrontend("Maria", "Junior"));
        equipes.put("Alpha", alpha);

        Equipe beta = new Equipe("Beta");
        beta.adicionar(new ConsultorBackend("Joao", "Junior"));
        beta.adicionar(new ConsultorDados("Ana", "Senior"));
        equipes.put("Beta", beta);

        String nomeEquipe = sc.nextLine();
        Equipe equipe = equipes.get(nomeEquipe);

        // TODO: Se a equipe existir, imprima os consultores ordenados; caso contrário "Equipe nao encontrada"
        if(equipe == null){
            System.out.println("Equipe nao encontrada");
        } else{
            for(Consultor c : equipe.ordenados()){
                System.out.println(c.nome + " " + c.especialidade + " " + c.nivel);
            }
        }
    }
}