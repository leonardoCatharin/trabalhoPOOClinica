package Modelo;

import java.util.Date;

public class Usuario extends Pessoa{
    private String login;
    private String senha;

    public Usuario(String login, String senha, String nome, String sobrenome, Date dataNascimento, String telefoneFixo, String telefoneCelular, String email) {
        super(nome, sobrenome, dataNascimento, telefoneFixo, telefoneCelular, email);
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
