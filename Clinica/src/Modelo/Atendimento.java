package Modelo;

import java.util.Date;
import java.util.List;

public class Atendimento extends RelatorioMedico {
    
    private List<Paciente> paciente;

    public Atendimento(List<Paciente> paciente, Medico medico, Date data) {
        super(medico, data);
        this.paciente = paciente;
    }
    
    
}
