package br.itau.spring03.dto;

import br.itau.spring03.model.Usuario;

// DTO = Data Transfer Object
public class UsuarioDTO {
    private String nome;
    private String email;
    private String login = "não logado";

    public UsuarioDTO (Usuario user){
        this.nome = user.getNome();
        this.email = user.getEmail();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    
    
}
