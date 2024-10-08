/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.p1_prog3.dao;

import java.util.List;

/**
 *
 * @author peanj
 */
public interface Dao<T> {
    public void save(T object) throws Exception;

    public List<T> getAll() throws Exception;
}
