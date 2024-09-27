package com.mycompany.p1_prog3.dao;

import com.mycompany.p1_prog3.model.Admin;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DaoAdmin extends Persistencia<Admin> implements Dao<Admin> {
    private final static String NOMEARQUIVO = "Admins.json";

    @Override
    public void save(Admin admin) throws Exception {
        List<Admin> admins = getAll();
        admins.add(admin);
        String json = getObjectmapper().writerWithDefaultPrettyPrinter().writeValueAsString(admins);
        try (FileOutputStream out = new FileOutputStream(NOMEARQUIVO)) {
            out.write(json.getBytes());
        }
    }

    @Override
    public List<Admin> getAll() throws Exception {
        try {
            FileInputStream in = new FileInputStream(NOMEARQUIVO);
            String json = new String(in.readAllBytes());
            return getObjectmapper().readValue(json, new TypeReference<List<Admin>>() {});
        } catch (FileNotFoundException f) {
            return new ArrayList<>();
        }
    }

    // Método para buscar um administrador pelo nome de usuário
    public Admin getAdminByUsername(String username) throws Exception {
        List<Admin> admins = getAll();
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username)) {
                return admin;
            }
        }
        return null; // Retorna null se não encontrar
    }
}
