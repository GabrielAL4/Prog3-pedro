/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.p1_prog3.dao;

/**
 *
 * @author peanj
 */
import com.mycompany.p1_prog3.model.UsuarioComum;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoUsuarioComum extends Persistencia<UsuarioComum> implements Dao<UsuarioComum>{
    private final static String NOMEARQUIVO = "UsuarioComums.json";
    @Override
    public void save(UsuarioComum UsuarioComum) throws Exception {
        List<UsuarioComum> UsuarioComums = getAll();
        UsuarioComums.add(UsuarioComum);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(UsuarioComums);
        FileOutputStream out = new FileOutputStream(NOMEARQUIVO);
        out.write(json.getBytes());
        out.close();
    }
    @Override
    public List<UsuarioComum> getAll() throws Exception {
        try {
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            List<UsuarioComum> UsuarioComums = getObjectmapper().readValue(json, new TypeReference<List<UsuarioComum>>() {
            });
            return UsuarioComums;
        } catch (FileNotFoundException f) {
            return new ArrayList();
        }
    }
}
