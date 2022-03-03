package Model;

import java.math.BigDecimal;

public class Historico extends AbstractEntity{
    private Agenda agenda;
    private String observacao;
    private Secretaria sectretaria;
    private Paciente paciente;
    private BigDecimal data;
    private StatusAgenda statusAgenda;

    public Historico() {
    }

    public Historico(Agenda agenda, String observacao, Secretaria sectretaria, Paciente paciente, BigDecimal data, StatusAgenda statusAgenda) {
        this.agenda = agenda;
        this.observacao = observacao;
        this.sectretaria = sectretaria;
        this.paciente = paciente;
        this.data = data;
        this.statusAgenda = statusAgenda;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public void setAgenda(Agenda agenda) {
        this.agenda = agenda;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Secretaria getSectretaria() {
        return sectretaria;
    }

    public void setSectretaria(Secretaria sectretaria) {
        this.sectretaria = sectretaria;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public BigDecimal getData() {
        return data;
    }

    public void setData(BigDecimal data) {
        this.data = data;
    }

    public StatusAgenda getStatusAgenda() {
        return statusAgenda;
    }

    public void setStatusAgenda(StatusAgenda statusAgenda) {
        this.statusAgenda = statusAgenda;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "agenda=" + agenda +
                ", observacao='" + observacao + '\'' +
                ", sectretaria=" + sectretaria +
                ", paciente=" + paciente +
                ", data=" + data +
                ", statusAgenda=" + statusAgenda +
                '}';
    }
}
