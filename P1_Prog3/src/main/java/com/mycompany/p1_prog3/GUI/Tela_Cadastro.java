/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.p1_prog3.GUI;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author peanj
 */
public class Tela_Cadastro extends javax.swing.JFrame {
    
    Escolha_ADMIN.add("Sim");
    choiceAdmin.add("Não");

    /**
     * Creates new form Tela_Cadastro
     */
    public Tela_Cadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton Criar_Cadastro = new javax.swing.JButton();
        javax.swing.JButton Botao_Consulta = new javax.swing.JButton();
        javax.swing.JButton Botao_Voltar = new javax.swing.JButton();
        Inserir_Nome = new javax.swing.JTextField();
        Inserir_Usuario = new javax.swing.JTextField();
        Inserir_Senha = new javax.swing.JPasswordField();
        Escolha_ADMIN = new java.awt.Choice();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TELA DE CADASTRO DE USUÁRIOS");
        jLabel1.setToolTipText("");

        jLabel2.setText("NOME COMPLETO");

        jLabel3.setText("NOME DE USUÁRIO");

        jLabel4.setText("SENHA [MÍNIMO 8 CARACTERES]");

        jLabel5.setText("USUÁRIO ADMIN?");

        Criar_Cadastro.setText("CADASTRAR");
        Criar_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Criar_CadastroActionPerformed(evt);
            }
        });

        Botao_Consulta.setText("CONSULTA");

        Botao_Voltar.setText("SAIR");

        Inserir_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inserir_UsuarioActionPerformed(evt);
            }
        });

        Escolha_ADMIN.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Criar_Cadastro)
                        .addGap(34, 34, 34)
                        .addComponent(Botao_Consulta)
                        .addGap(32, 32, 32)
                        .addComponent(Botao_Voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Inserir_Usuario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Inserir_Nome))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(19, 19, 19)
                                .addComponent(Escolha_ADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Inserir_Senha)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Inserir_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Inserir_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Inserir_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Escolha_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Criar_Cadastro)
                    .addComponent(Botao_Consulta)
                    .addComponent(Botao_Voltar))
                .addGap(18, 18, 18))
        );

        Escolha_ADMIN.getAccessibleContext().setAccessibleName("");
        Escolha_ADMIN.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Criar_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Criar_CadastroActionPerformed
         String Nome_Completo = Inserir_Nome.getText();
        String Usuario = Inserir_Usuario.getText();
        char[] senhaCharArray = Inserir_Senha.getPassword();  // Obtém a senha como char[]
        String Senha = new String(senhaCharArray);  // Converte para String

        // Obtém a escolha do usuário: se será admin ou não
        String escolhaAdmin = Escolha_ADMIN.getSelectedItem();  // Captura a escolha no Choice

        boolean isAdmin = escolhaAdmin.equals("Sim");  // Verifica se a escolha foi "Sim"

        if (Nome_Completo.isEmpty() || Usuario.isEmpty() || Senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos", "Tente outra vez", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) Tabela_Usuarios.getModel();
            // Adiciona o usuário à tabela, indicando se é Admin ou Comum
            model.addRow(new Object[]{Nome_Completo, Usuario, Senha, isAdmin ? "Admin" : "Comum"});  
        }

        Inserir_Nome.setText("");
        Inserir_Usuario.setText("");
        Inserir_Senha.setText("");  // Limpa o campo da senhar_Senha.setText("");  // Limpa o campo da senha
    }//GEN-LAST:event_Criar_CadastroActionPerformed

    private void Inserir_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inserir_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inserir_UsuarioActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice Escolha_ADMIN;
    private javax.swing.JTextField Inserir_Nome;
    private javax.swing.JPasswordField Inserir_Senha;
    private javax.swing.JTextField Inserir_Usuario;
    // End of variables declaration//GEN-END:variables
}
