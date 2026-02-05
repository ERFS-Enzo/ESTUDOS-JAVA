import java.util.*;

public class Main {
    public static void main(String[] args) {
      /*
        Cada projeto possui uma lista de consultores,
        podendo ser de diferentes especialidades: Desenvolvedor, Analista ou Gerente.

        Cada consultor tem um nome e uma especialidade
        cada especialidade possui uma forma diferente de apresentar seu relatório

        O cliente solicitou um sistema que, ao receber uma lista de consultores,
        gere um relatório com a apresentação de cada um,
        respeitando as regras de polimorfismo:
        -Desenvolvedores apresentam-se com "Dev: [nome]"
        -Analistas com "Analyst: [nome]"
        -Gerentes com "Manager: [nome]"

        sistema deve ser utilizando herança e polimorfismo,
        armazenando os consultores em uma coleção adequada.

        Sua tarefa é implementar esse sistema para automatizar
        a geração dos relatórios personalizados.

        ler uma lista de consultores, cada um no formato
        "[especialidade] [nome]", separados por ponto e vírgula.

        deve imprimir, para cada consultor,
        uma linha com sua apresentação conforme as regras acima,
        na ordem em que aparecem na entrada.


        ENTRADA:
        Uma única linha contendo uma lista de consultores separados por ponto e vírgula.
        Cada consultor é descrito por sua especialidade (Developer, Analyst ou Manager)
        seguida de um espaço e seu nome.
        Não há espaços antes ou depois dos pontos e vírgulas.

        SAIDA:
        Para cada consultor, uma linha com sua apresentação personalizada,
        na ordem em que aparecem na entrada.
      */
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().trim();
        List<Consultant> consultantList = new ArrayList<>();

        // Cada consultor pode vir separado por ";"
        String[] entries = inputLine.split(";");

        for (String entry : entries) {
            entry = entry.trim();
            if (entry.isEmpty()) continue;

            String[] parts = entry.split(" ", 2);
            String jobTitle = parts[0];
            String personName = parts[1];

            // TODO: Criar os if/else para instanciar Developer, Analyst ou Manager.
            if(jobTitle.equalsIgnoreCase("Developer")){
                consultantList.add(new Developer(personName));
            } else if(jobTitle.equalsIgnoreCase("Analyst")){
                consultantList.add(new Analyst((personName)));
            } else if (jobTitle.equalsIgnoreCase("Manager")) {
                consultantList.add(new Manager(personName));
            }

        }

        // Impressão final na ordem de entrada
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }

    }
}