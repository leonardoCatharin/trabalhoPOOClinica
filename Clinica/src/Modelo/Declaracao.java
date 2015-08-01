package Modelo;

import java.util.Date;

public class Declaracao extends RelatorioMedico{
    private String nomeAcompanhante;
    private Paciente paciente;
    private String motivo;

    public Declaracao(String nomeAcompanhante, Paciente paciente, String motivo, Medico medico, Date data) {
        super(medico, data);
        this.nomeAcompanhante = nomeAcompanhante;
        this.paciente = paciente;
        this.motivo = motivo;
    }

    public String getNomeAcompanhante() {
        return nomeAcompanhante;
    }

    public void setNomeAcompanhante(String nomeAcompanhante) {
        this.nomeAcompanhante = nomeAcompanhante;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

}
