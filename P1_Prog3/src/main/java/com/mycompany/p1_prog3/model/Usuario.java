package com.mycompany.p1_prog3.model;

import java.util.Date;

public class Usuario {
    private String nomeCompleto;
    private String usuario;
    private String senha;
    private Date dataCadastro;
    private boolean isAdmin;  // Adicionar este campo

    // Construtor
    public Usuario(String nomeCompleto, String username, String senha, Date dataCadastro, boolean isAdmin) {
        this.nomeCompleto = nomeCompleto;
        this.usuario = username;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
        this.isAdmin = isAdmin; // Inicializar isAdmin
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
