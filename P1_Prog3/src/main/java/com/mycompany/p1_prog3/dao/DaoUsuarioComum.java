package com.mycompany.p1_prog3.dao;

import com.mycompany.p1_prog3.model.UsuarioComum;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoUsuarioComum extends Persistencia<UsuarioComum> implements Dao<UsuarioComum> {
    private final static String NOMEARQUIVO = "UsuarioComums.json";

    @Override
    public void save(UsuarioComum UsuarioComum) throws Exception {
        List<UsuarioComum> UsuarioComums = getAll();
        UsuarioComums.add(UsuarioComum);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(UsuarioComums);
        try (FileOutputStream out = new FileOutputStream(NOMEARQUIVO)) {
            out.write(json.getBytes());
        }
    }

    @Override
    public List<UsuarioComum> getAll() throws Exception {
        try {
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            return getObjectmapper().readValue(json, new TypeReference<List<UsuarioComum>>() {});
        } catch (FileNotFoundException f) {
            return new ArrayList<>();
        }
    }

    // Método para buscar um UsuarioComumistrador pelo nome de usuário
    public UsuarioComum getUsuarioComumByUsername(String username) throws Exception {
        List<UsuarioComum> UsuarioComums = getAll();
        for (UsuarioComum UsuarioComum : UsuarioComums) {
            if (UsuarioComum.getUsername().equals(username)) {
                return UsuarioComum;
            }
        }
        return null; // Retorna null se não encontrar
    }
}
