/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Walney
 */
public class ConsultarUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarUsuario
     */
    private JDesktopPane jdpPrincipal;
    public ConsultarUsuario(JDesktopPane jdp) {
        initComponents();
        jdpPrincipal = jdp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btNovo = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Usuarios");
        setToolTipText("");

        jLabel2.setText("Login");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btNovo.setText("Novo");
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovoActionPerformed(evt);
            }
        });

        jButton3.setText("Alterar");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.setEnabled(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtCliente);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLogin)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addComponent(btExcluir)
                    .addComponent(jButton5)
                    .addComponent(btnLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovoActionPerformed
        // TODO add your handling code here:
            CadastroUsuario cadastrousuario = new CadastroUsuario(jdpPrincipal);
        this.jdpPrincipal.add(cadastrousuario);
        cadastrousuario.setVisible(true);
    }//GEN-LAST:event_btNovoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            
            Connection conn = null;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava","root","walney");
                            
            String sql = "select * from projetojava.usuario ";
            if(!txtLogin.getText().equals(""))
                sql = sql + " where login LIKE ? ";
            PreparedStatement stmt = con.prepareStatement(sql);
           
            if(!txtLogin.getText().equals(""))
                stmt.setString(1, "%"+txtLogin.getText()+"%");
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jtCliente.getModel();
            model.setNumRows(0);
            while(rs.next()){
                String[] linha = {rs.getString("ID"), rs.getString("Nome"),
                    rs.getString("Login")};
                model.addRow(linha);
            }
            
            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        // TODO add your handling code here:
        try{
            Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/"
                    + "projetojava","root","admin");  
            String sql = "delete from projetojava.usuario where IDCliente = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            int linha = this.jtCliente.getSelectedRow();
            stmt.setInt(1, Integer.parseInt(jtCliente.getValueAt(linha, 0).toString()));
            stmt.execute();
            stmt.close();
            con.close();
            DefaultTableModel model = (DefaultTableModel) jtCliente.getModel();
            model.removeRow(linha);
            JOptionPane.showMessageDialog(this, "Cliente Excluído com Sucesso!");
            this.setClosable(true);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int linha = this.jtCliente.getSelectedRow();
       int id = Integer.parseInt(jtCliente.getValueAt(linha, 0).toString());
        CadastroUsuario cadastrarCliente = new CadastroUsuario(id);
        jdpPrincipal.add(cadastrarCliente);
        cadastrarCliente.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
        txtLogin.setText("");
        DefaultTableModel model = (DefaultTableModel) jtCliente.getModel();
        model.setNumRows(0);
    }//GEN-LAST:event_btnLimparActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btNovo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txtLogin;
    // End of variables declaration//GEN-END:variables
}
