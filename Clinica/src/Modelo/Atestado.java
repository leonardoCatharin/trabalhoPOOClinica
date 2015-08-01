package Modelo;

import java.util.Date;

public class Atestado extends RelatorioMedico{
    private Date dataIncio;
    private Date dataFim;
    private String doenca;
    private String motivo;

    public Atestado(Date dataIncio, Date dataFim, String doenca, String motivo, Medico medico, Date data) {
        super(medico, data);
        this.dataIncio = dataIncio;
        this.dataFim = dataFim;
        this.doenca = doenca;
        this.motivo = motivo;
    }

    

    public Date getDataIncio() {
        return dataIncio;
    }

    public void setDataIncio(Date dataIncio) {
        this.dataIncio = dataIncio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }


    


}
