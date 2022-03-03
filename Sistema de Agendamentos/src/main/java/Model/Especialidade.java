package Model;

public class Especialidade extends AbstractEntity {
    private String nomeEspecialidade;

    public Especialidade() {
    }

    public Especialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    @Override
    public String toString() {
        return "Especialidade{" +
                "nomeEspecialidade='" + nomeEspecialidade + '\'' +
                '}';
    }

}
