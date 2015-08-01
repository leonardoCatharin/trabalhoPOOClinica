package Modelo;

import java.util.List;

public class Paciente {
    private String convenio;
    private String nomeDoPai;
    private String nomeDaMae;
    private List<Prontuario> protuarios;
    private List<DadoAdicional> dadosAdicionais;

    public Paciente(String convenio, String nomeDoPai, String nomeDaMae, List<Prontuario> protuarios, List<DadoAdicional> dadosAdicionais) {
        this.convenio = convenio;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.protuarios = protuarios;
        this.dadosAdicionais = dadosAdicionais;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }

    public List<Prontuario> getProtuarios() {
        return protuarios;
    }

    public void setProtuarios(List<Prontuario> protuarios) {
        this.protuarios = protuarios;
    }

    public List<DadoAdicional> getDadosAdicionais() {
        return dadosAdicionais;
    }

    public void setDadosAdicionais(List<DadoAdicional> dadosAdicionais) {
        this.dadosAdicionais = dadosAdicionais;
    }

    
}
