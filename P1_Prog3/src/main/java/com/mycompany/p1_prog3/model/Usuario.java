package com.mycompany.p1_prog3.model;

import java.util.Date;

/**
 *
 * @author peanj
 */
public class Usuario {
    private String nome_Completo;
    private String usuario;
    private String senha;
    private Date dataCadastro;

    // Construtor
    public Usuario(String nomeCompleto, String username, String senha, Date dataCadastro, boolean isAdmin) {
        this.nome_Completo = nomeCompleto;
        this.usuario = username;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.isAdmin = isAdmin;
    }

    // Getters e setters
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    
    public String getUsername() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
    public boolean getIsAdmin() {
        return isAdmin;
    }
}

