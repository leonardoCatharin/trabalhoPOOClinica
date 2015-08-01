package Modelo;

public class Remedio {
    private String remedio;
    private String dosagem;
    private String uso;

    public Remedio(String remedio, String dosagem, String uso) {
        this.remedio = remedio;
        this.dosagem = dosagem;
        this.uso = uso;
    }

    public String getRemedio() {
        return remedio;
    }

    public void setRemedio(String remedio) {
        this.remedio = remedio;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }
    
    
}
