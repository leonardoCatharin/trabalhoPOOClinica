package Modelo;

import java.util.Date;
import java.util.List;

public class Receita extends RelatorioMedico{
    private List<Remedio> remedio;

    public Receita(List<Remedio> remedio, Medico medico, Date data) {
        super(medico, data);
        this.remedio = remedio;
    }

    public List<Remedio> getRemedio() {
        return remedio;
    }
    public void setRemedio(List<Remedio> remedio) {
        this.remedio = remedio;
    }
    
}
