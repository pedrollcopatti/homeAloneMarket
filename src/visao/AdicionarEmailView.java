/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Email;

/**
 *
 * @author pedro
 */
public class AdicionarEmailView extends javax.swing.JFrame {

        private HomeAloneView homeAloneView;
    /**
     * Creates new form AdicionarContatoView
     */
    public AdicionarEmailView(HomeAloneView homeAloneView) {
        this.homeAloneView = homeAloneView;
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

        jLabel7 = new javax.swing.JLabel();
        jlVoltar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jlVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jlVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jlVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 46, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cadastrar Email");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, -1, -1));

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 470, 40));

        btSalvar.setBackground(new java.awt.Color(95, 46, 234));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 470, 45));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jlVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVoltarMouseClicked
        this.dispose();
        this.homeAloneView.setVisible(true);
    }//GEN-LAST:event_jlVoltarMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        String email = tfEmail.getText();
        ArrayList<Email> emails = homeAloneView.getEmails();
        boolean existe = false;

        for (Email emailFor : emails) {
            if (emailFor.getEmail().equals(email)){
                existe = true;
                break;
            }
        }
        if (existe){
            JOptionPane.showMessageDialog(null, "Email já cadastrado");
        } else {
            emails.add(new Email(email));
            JOptionPane.showMessageDialog(null, "Email cadastrado com sucesso!");
        }

    }//GEN-LAST:event_btSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlVoltar;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
