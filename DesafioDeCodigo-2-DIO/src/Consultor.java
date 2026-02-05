public abstract class Consultor implements Comparable<Consultor> {
    public String nome;
    public String nivel;
    public String especialidade;

    public Consultor(String nome, String nivel, String especialidade) {
        this.nome = nome;
        this.nivel = nivel;
        this.especialidade = especialidade;
    }

    @Override
    public int compareTo(Consultor outro) {
        return this.nome.compareTo(outro.nome);
    }
}
