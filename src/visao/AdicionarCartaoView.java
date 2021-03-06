/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cartao;
import modelo.Bandeira;

/**
 *
 * @author pedro
 */
public class AdicionarCartaoView extends javax.swing.JFrame {

    private HomeAloneView homeAloneView;
    /**
     * Creates new form AdicionarCartao
     */
    public AdicionarCartaoView(HomeAloneView homeAloneView) {
        this.homeAloneView = homeAloneView;
        initComponents();
        Bandeira[] values = Bandeira.values();
        for (int i = 0; i < values.length; i++) {
            Bandeira bandeira = values[i];
            cbTipoCartao.addItem(bandeira);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbTipoCartao = new javax.swing.JComboBox<>();
        jlVoltar = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        tfNumeroVerificacao = new javax.swing.JTextField();
        tfNumero = new javax.swing.JTextField();
        tfValidade = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tipo de Cart??o:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N??mero do Cart??o:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Data de Vencimento:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("N??mero de Verifica????o:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Adicionar cart??o:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        cbTipoCartao.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(cbTipoCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 120, 30));

        jlVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jlVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jlVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, 40));

        btSalvar.setBackground(new java.awt.Color(95, 46, 234));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 365, 487, 40));

        tfNumeroVerificacao.setBackground(new java.awt.Color(255, 255, 255));
        tfNumeroVerificacao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfNumeroVerificacao.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfNumeroVerificacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 130, 40));

        tfNumero.setBackground(new java.awt.Color(255, 255, 255));
        tfNumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfNumero.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(tfNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 290, 40));

        tfValidade.setBackground(new java.awt.Color(255, 255, 255));
        tfValidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tfValidade.setForeground(new java.awt.Color(0, 0, 0));
        tfValidade.setText("mm/yyyy");
        getContentPane().add(tfValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 130, 40));

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
        String numero = tfNumero.getText();
        long numeroLong = Long.parseLong(numero);
        String numeroVerificacao = tfNumeroVerificacao.getText();
        int numeroVerificacaoInt = Integer.parseInt(numeroVerificacao);
        String validade = tfValidade.getText();
        ArrayList<Cartao> cartoes = homeAloneView.getCartoes();
        boolean existe = false;

        for (Cartao cartao : cartoes) {
            if (cartao.getNumero() == numeroLong
                && cartao.getNumeroVerificacao() == numeroVerificacaoInt){
                existe = true;
                break;
            }
        }
        if (existe){
            JOptionPane.showMessageDialog(null, "Cart??o j?? cadastrado");
        } else {
            Bandeira bandeira = (Bandeira) cbTipoCartao.getSelectedItem();
            cartoes.add(new Cartao(numeroLong, validade, bandeira, numeroVerificacaoInt));
            JOptionPane.showMessageDialog(null, "Cart??o cadastrado com sucesso!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<Bandeira> cbTipoCartao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlVoltar;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfNumeroVerificacao;
    private javax.swing.JTextField tfValidade;
    // End of variables declaration//GEN-END:variables
}
