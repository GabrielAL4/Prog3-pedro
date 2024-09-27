package com.mycompany.p1_prog3.model;

import java.util.Date;

public class Admin extends Usuario {

    // O construtor de Admin deve sempre definir isAdmin como true
    public Admin(String nomeCompleto, String username, String senha, Date dataCadastro) {
        super(nomeCompleto, username, senha, dataCadastro, true);  // Passa 'true' para isAdmin
    }
    
}
