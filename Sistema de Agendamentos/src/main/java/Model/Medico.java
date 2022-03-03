package Model;

import java.math.BigDecimal;

public class Medico extends Pessoa{
    private String crm;
    private BigDecimal porcenParticipacao;
    private String consultorio;
    private Especialidade especialidade;

    public Medico() {
    }

    public Medico(String crm, BigDecimal porcenParticipacao, String consultorio, Especialidade especialidade) {
        this.crm = crm;
        this.porcenParticipacao = porcenParticipacao;
        this.consultorio = consultorio;
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public BigDecimal getPorcenParticipacao() {
        return porcenParticipacao;
    }

    public void setPorcenParticipacao(BigDecimal porcenParticipacao) {
        this.porcenParticipacao = porcenParticipacao;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm='" + crm + '\'' +
                ", porcenParticipacao=" + porcenParticipacao +
                ", consultorio='" + consultorio + '\'' +
                ", especialidade=" + especialidade +
                '}';
    }
}
