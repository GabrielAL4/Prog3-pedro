/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p1_prog3;

import javax.swing.table.DefaultTableModel;

public class Tabela_Modelo {
    private static Tabela_Modelo instance;
    private DefaultTableModel Tabela_Modelo;

    private Tabela_Modelo() {
        // Adicionando uma coluna "Admin" para indicar se o usuário é administrador ou comum
        Tabela_Modelo = new DefaultTableModel(new Object[]{"Nome Completo", "Usuário", "Senha", "Admin"}, 0);
    }

    public static Tabela_Modelo getInstance() {
        if (instance == null) {
            instance = new Tabela_Modelo();
        }
        return instance;
    }

    public DefaultTableModel getTableModel() {
        return Tabela_Modelo;
    }
}
