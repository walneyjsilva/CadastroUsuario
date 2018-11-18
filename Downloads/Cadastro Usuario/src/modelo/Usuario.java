/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author walney
 */
public class Usuario {
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String login;
    String senha;
    String pegaID;
    String pegausuario;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    } 
    public String getNome() { 
        return nome;
    } 
    public void setNome(String nome) { 
        this.nome = nome;
    } 
    public String getTelefone() { 
        return telefone;
    } 
    public void setTelefone(String telefone) { 
        this.telefone = telefone;
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
    
     public String getpegaId() { 
        return pegaID;
    } 
    public void setpegaId(String pegaID) { 
        this.pegaID = pegaID;
    } 
    public String getpegausuario() { 
        return pegausuario;
    } 
    public void setpegausuario(String pegausuario) { 
        this.pegausuario = pegausuario;
    } 
}

