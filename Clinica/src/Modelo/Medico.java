package Modelo;

import java.util.Date;

public class Medico extends Usuario{
    private String matricula;
    private String especializacao;

    public Medico(String matricula, String especializacao, String login, String senha, String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email) {
        super(login, senha, nome, sobrenome, dataNascimento, telefoneFixo, telefoneCelular, email);
        this.matricula = matricula;
        this.especializacao = especializacao;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    
}
