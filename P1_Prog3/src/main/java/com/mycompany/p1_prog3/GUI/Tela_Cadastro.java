package com.mycompany.p1_prog3.GUI;

import com.mycompany.p1_prog3.dao.DaoAdmin;
import com.mycompany.p1_prog3.model.Admin;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Tela_Cadastro extends javax.swing.JFrame {

    private DefaultTableModel model;

    public Tela_Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();

        Tabela_Usuarios = new javax.swing.JTable();
        String[] colunas = {"Nome Completo", "Nome de Usuário", "Senha", "Tipo"};
        model = new DefaultTableModel(colunas, 0);
        Tabela_Usuarios.setModel(model);
        jScrollPane1.setViewportView(Tabela_Usuarios);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TELA DE CADASTRO DE USUÁRIOS");
        jLabel2.setText("NOME COMPLETO");
        jLabel3.setText("NOME DE USUÁRIO");
        jLabel4.setText("SENHA [MÍNIMO 8 CARACTERES]");
        jLabel5.setText("USUÁRIO ADMIN?");

        Escolha_ADMIN.add("Sim");
        Escolha_ADMIN.add("Não");

        Criar_Cadastro.setText("CADASTRAR");
        Criar_Cadastro.addActionListener(evt -> Criar_CadastroActionPerformed(evt));

        Botao_Consulta.setText("CONSULTA");
        Botao_Consulta.addActionListener(evt -> consultarUsuarios());

        Botao_Voltar.setText("SAIR");
        Botao_Voltar.addActionListener(evt -> System.exit(0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(102, 102, 102))
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
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Criar_Cadastro)
                                        .addComponent(Botao_Consulta)
                                        .addComponent(Botao_Voltar))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void Criar_CadastroActionPerformed(java.awt.event.ActionEvent evt) {
        String Nome_Completo = Inserir_Nome.getText();
        String Usuario = Inserir_Usuario.getText();
        char[] senhaCharArray = Inserir_Senha.getPassword();
        String Senha = new String(senhaCharArray);

        String escolhaAdmin = Escolha_ADMIN.getSelectedItem();
        boolean isAdmin = escolhaAdmin.equals("Sim");

        if (Nome_Completo.isEmpty() || Usuario.isEmpty() || Senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor preencha todos os campos", "Tente outra vez", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Senha.length() < 8) {
            JOptionPane.showMessageDialog(this, "A senha deve ter no mínimo 8 caracteres", "Tente outra vez", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verifica se o usuário já existe
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 1).equals(Usuario)) {
                JOptionPane.showMessageDialog(this, "Usuário já existe!", "Tente outra vez", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        // Adiciona o novo usuário na tabela
        model.addRow(new Object[]{Nome_Completo, Usuario, Senha, isAdmin ? "Admin" : "Comum"});

        // Salva o novo usuário no JSON
        DaoAdmin daoAdmin = new DaoAdmin();
        try {
            Admin novoAdmin = new Admin(Nome_Completo, Usuario, Senha, new Date());
            daoAdmin.save(novoAdmin); // Salva o admin no arquivo JSON
            JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace(); // Para fins de debug
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar usuário: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }

        // Limpa os campos
        Inserir_Nome.setText("");
        Inserir_Usuario.setText("");
        Inserir_Senha.setText("");
    }


    private void consultarUsuarios() {
        String usuario = JOptionPane.showInputDialog("Digite o nome de usuário:");
        String senha = JOptionPane.showInputDialog("Digite a senha:");

        boolean usuarioValido = false;
        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 1).equals(usuario) && model.getValueAt(i, 2).equals(senha)) {
                usuarioValido = true;
                break;
            }
        }

        if (usuarioValido) {
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Tela_Cadastro().setVisible(true));
    }

    // Variáveis de classe
    private javax.swing.JTextField Inserir_Nome;
    private javax.swing.JPasswordField Inserir_Senha;
    private javax.swing.JTextField Inserir_Usuario;
    private javax.swing.JTable Tabela_Usuarios;
    private java.awt.Choice Escolha_ADMIN;
}
