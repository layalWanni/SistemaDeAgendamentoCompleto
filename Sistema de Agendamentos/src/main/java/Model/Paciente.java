package Model;

import java.time.LocalDateTime;

public class Paciente extends Pessoa{
    private TipoAtendimento tipoAtendimento;
    private Convenio convenio;
    private String numeroCartaoConvenio;
    private LocalDateTime dataVencimento;

    public Paciente() {
    }

    public Paciente(TipoAtendimento tipoAtendimento, Convenio convenio, String numeroCartaoConvenio, LocalDateTime dataVencimento) {
        this.tipoAtendimento = tipoAtendimento;
        this.convenio = convenio;
        this.numeroCartaoConvenio = numeroCartaoConvenio;
        this.dataVencimento = dataVencimento;
    }

    public TipoAtendimento getTipoAtendimento() {
        return tipoAtendimento;
    }

    public void setTipoAtendimento(TipoAtendimento tipoAtendimento) {
        this.tipoAtendimento = tipoAtendimento;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public String getNumeroCartaoConvenio() {
        return numeroCartaoConvenio;
    }

    public void setNumeroCartaoConvenio(String numeroCartaoConvenio) {
        this.numeroCartaoConvenio = numeroCartaoConvenio;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "tipoAtendimento=" + tipoAtendimento +
                ", convenio=" + convenio +
                ", numeroCartaoConvenio='" + numeroCartaoConvenio + '\'' +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}
