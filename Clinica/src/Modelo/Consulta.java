package Modelo;

import java.util.Date;

public class Consulta extends Entidade{
    private Date data;
    private String hora;
    private Medico medico;
    private Paciente paciente;

    public Consulta(Date data, String hora, Medico medico, Paciente paciente) {
        this.data = data;
        this.hora = hora;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    
}
