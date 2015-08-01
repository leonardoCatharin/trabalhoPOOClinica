package Modelo;

import java.util.Date;

public class RelatorioMedico extends Relatorio {
    Medico medico;

    public RelatorioMedico(Medico medico, Date data) {
        super(data);
        this.medico = medico;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
