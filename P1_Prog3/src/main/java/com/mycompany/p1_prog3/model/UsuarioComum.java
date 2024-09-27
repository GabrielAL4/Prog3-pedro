package com.mycompany.p1_prog3.model;

import java.util.Date;

public class UsuarioComum extends Usuario {

    // O construtor de UsuarioComum deve sempre definir isAdmin como false
    public UsuarioComum(String nomeCompleto, String username, String senha, Date dataCadastro) {
        super(nomeCompleto, username, senha, dataCadastro, false);  // Passa 'false' para isAdmin
    }
    
}
