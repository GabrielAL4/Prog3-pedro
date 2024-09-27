package com.mycompany.p1_prog3.GUI;

import com.mycompany.p1_prog3.dao.DaoAdmin;
import com.mycompany.p1_prog3.model.Admin;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.List;

public class Tela_Login extends javax.swing.JFrame {

    public Tela_Login() {
        initComponents();
        adicionarUsuarioPadrao();
    }
    private void adicionarUsuarioPadrao() {
        DaoAdmin daoAdmin = new DaoAdmin();
        try {
            List<Admin> admins = daoAdmin.getAll();

            // Verifica se o admin já existe
            boolean adminExists = admins.stream().anyMatch(a -> "admin".equals(a.getUsername()));

            if (!adminExists) {
                Admin admin = new Admin("Admin", "admin", "admin", new Date()); // Adiciona a data atual
                daoAdmin.save(admin); // Salva no arquivo
            }
        } catch (Exception e) {
            e.printStackTrace(); // Para fins de debug
        }
    }
    @SuppressWarnings("unchecked")
    private void initComponents() {
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Insira o Usuário e a Senha");
        jLabel1.setToolTipText("");

        jScrollPane2.setViewportView(jTextPane2);

        jPasswordField1.setToolTipText("");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Usuário");
        jLabel3.setText("Senha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(63, 63, 63)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jButton1)
                                                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        DaoAdmin daoAdmin = new DaoAdmin();
        try {
            List<Admin> admins = daoAdmin.getAll(); // Carrega todos os admins

            boolean loginSuccess = admins.stream()
                    .anyMatch(a -> a.getUsername().equals(jTextPane2.getText()) &&
                            a.getSenha().equals(new String(jPasswordField1.getPassword())));

            if (loginSuccess) {
                JOptionPane.showMessageDialog(null, "Login feito com sucesso");

                // Cria e exibe a tela de cadastro
                Tela_Cadastro telaCadastro = new Tela_Cadastro();
                telaCadastro.setVisible(true);
                this.dispose(); // Fecha a tela de login (opcional)
            } else {
                JOptionPane.showMessageDialog(null, "Login incorreto");
            }
        } catch (Exception e) {
            e.printStackTrace(); // Para fins de debug
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Tela_Login().setVisible(true));
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration
}
