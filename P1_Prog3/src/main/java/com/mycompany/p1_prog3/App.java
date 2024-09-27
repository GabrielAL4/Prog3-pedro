/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p1_prog3;

/**
 *
 * @author peanj
 */

import javax.swing.*;

public class App {

    public static void main(String[] args) {
        GuiMenu guiMenu = new GuiMenu();
        JFrame frame = new JFrame("Menu");
        frame.setContentPane(guiMenu.JPMenu);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
