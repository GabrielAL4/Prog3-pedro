package com.mycompany.p1_prog3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Admin extends Usuario {

    @JsonCreator
    public Admin(
            @JsonProperty("nomeCompleto") String nomeCompleto,
            @JsonProperty("username") String username,
            @JsonProperty("senha") String senha,
            @JsonProperty("dataCadastro") Date dataCadastro) {
        super(nomeCompleto, username, senha, dataCadastro, true);
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public String getSenha() {
        return super.getSenha();
    }

    // Restante da classe...
}
