package Modelo;

import java.util.List;

class Prontuario extends Entidade{
    private List<String> sintoma;
    private String diagnostico;
    private String tratamento;

    public Prontuario(List<String> sintoma, String diagnostico, String tratamento) {
        this.sintoma = sintoma;
        this.diagnostico = diagnostico;
        this.tratamento = tratamento;
    }

    public List<String> getSintoma() {
        return sintoma;
    }

    public void setSintoma(List<String> sintoma) {
        this.sintoma = sintoma;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        this.tratamento = tratamento;
    }
    
    
    
    
}
