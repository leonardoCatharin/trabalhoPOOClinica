package Modelo;

class DadoAdicional extends Entidade{
    private String doenca;
    private String agravante;

    public DadoAdicional(String doenca, String agravante) {
        this.doenca = doenca;
        this.agravante = agravante;
    }

    public String getDoenca() {
        return doenca;
    }

    public void setDoenca(String doenca) {
        this.doenca = doenca;
    }

    public String getAgravante() {
        return agravante;
    }

    public void setAgravante(String agravante) {
        this.agravante = agravante;
    }
    
    
    
}
