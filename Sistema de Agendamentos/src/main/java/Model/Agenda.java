package Model;

import java.time.LocalDateTime;

public class Agenda extends AbstractEntity{
    private Paciente paciente;
    private Medico medico;
    private StatusAgenda statusAgenda;
    private LocalDateTime dataAgenedamento;
    private Boolean encaixe;

    public Agenda() {
    }

    public Agenda(Paciente paciente, Medico medico, StatusAgenda statusAgenda, LocalDateTime dataAgenedamento, Boolean encaixe) {
        this.paciente = paciente;
        this.medico = medico;
        this.statusAgenda = statusAgenda;
        this.dataAgenedamento = dataAgenedamento;
        this.encaixe = encaixe;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public StatusAgenda getStatusAgenda() {
        return statusAgenda;
    }

    public void setStatusAgenda(StatusAgenda statusAgenda) {
        this.statusAgenda = statusAgenda;
    }

    public LocalDateTime getDataAgenedamento() {
        return dataAgenedamento;
    }

    public void setDataAgenedamento(LocalDateTime dataAgenedamento) {
        this.dataAgenedamento = dataAgenedamento;
    }

    public Boolean getEncaixe() {
        return encaixe;
    }

    public void setEncaixe(Boolean encaixe) {
        this.encaixe = encaixe;
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "paciente=" + paciente +
                ", medico=" + medico +
                ", statusAgenda=" + statusAgenda +
                ", dataAgenedamento=" + dataAgenedamento +
                ", encaixe=" + encaixe +
                '}';
    }
}
