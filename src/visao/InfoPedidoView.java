/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Bandeira;
import modelo.Boleto;
import modelo.Cartao;
import modelo.Compra;
import modelo.Endereco;
import modelo.MetodoPagamento;
import modelo.Orcamento;
import modelo.Telefone;
import modelo.Produto;
import modelo.Status;

/**
 *
 * @author pedro
 */
public class InfoPedidoView extends javax.swing.JFrame {

    private HomeAloneView homeAloneView;
    private ArrayList<Compra> compras;
    /**
     * Creates new form NovoPedidoView
     */
    public InfoPedidoView(HomeAloneView homeAloneView) {
        this.homeAloneView = homeAloneView;
        initComponents();
        
        Status[] values = Status.values();
        for (int i = 0; i < values.length; i++) {
            Status status = values[i];
            cbStatus.addItem(status);
        }
        
        Orcamento orcamento1 = new Orcamento(51.89);
        Orcamento orcamento2 = new Orcamento(53.99);
        Orcamento orcamento3 = new Orcamento(0.00);
        cbOrcamento.addItem(orcamento1);
        cbOrcamento.addItem(orcamento2);
        cbOrcamento.addItem(orcamento3);
        cbOrcamento.setSelectedItem(orcamento3);
        
        homeAloneView.setVisible(false);
        this.compras = homeAloneView.getCompras();
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
        jLabel1 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taProdutosLista = new javax.swing.JTextArea();
        jlVoltar = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        tfDataEntrega = new javax.swing.JTextField();
        tfEndereco = new javax.swing.JTextField();
        spId = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        tfMetodoPagamento = new javax.swing.JTextField();
        cbOrcamento = new javax.swing.JComboBox<>();
        jCarregar = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfDataPrevisao = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        btApagar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Pedidos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Status:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, 20));

        tfEmail.setBackground(new java.awt.Color(255, 255, 255));
        tfEmail.setForeground(new java.awt.Color(0, 0, 0));
        tfEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEmail.setToolTipText("");
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });
        getContentPane().add(tfEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 130, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lista de produtos:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Endereço:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        taProdutosLista.setBackground(new java.awt.Color(255, 255, 255));
        taProdutosLista.setColumns(20);
        taProdutosLista.setForeground(new java.awt.Color(0, 0, 0));
        taProdutosLista.setRows(5);
        taProdutosLista.setToolTipText("");
        jScrollPane2.setViewportView(taProdutosLista);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 340, 150));

        jlVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        jlVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jlVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 40));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Orcamento:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, -1));

        btSalvar.setBackground(new java.awt.Color(95, 46, 234));
        btSalvar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Confirmar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 340, 40));

        tfDataEntrega.setBackground(new java.awt.Color(255, 255, 255));
        tfDataEntrega.setForeground(new java.awt.Color(0, 0, 0));
        tfDataEntrega.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataEntrega.setToolTipText("");
        tfDataEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataEntregaActionPerformed(evt);
            }
        });
        getContentPane().add(tfDataEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, -1));

        tfEndereco.setBackground(new java.awt.Color(255, 255, 255));
        tfEndereco.setForeground(new java.awt.Color(0, 0, 0));
        tfEndereco.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfEndereco.setToolTipText("");
        tfEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEnderecoActionPerformed(evt);
            }
        });
        getContentPane().add(tfEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, -1));

        spId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(spId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 70, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Data da Entrega:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, 20));

        tfMetodoPagamento.setBackground(new java.awt.Color(255, 255, 255));
        tfMetodoPagamento.setForeground(new java.awt.Color(0, 0, 0));
        tfMetodoPagamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMetodoPagamento.setToolTipText("");
        tfMetodoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMetodoPagamentoActionPerformed(evt);
            }
        });
        getContentPane().add(tfMetodoPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, -1));

        cbOrcamento.setBackground(new java.awt.Color(255, 255, 255));
        cbOrcamento.setForeground(new java.awt.Color(0, 0, 0));
        cbOrcamento.setToolTipText("");
        getContentPane().add(cbOrcamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 120, -1));

        jCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/seta.png"))); // NOI18N
        jCarregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCarregarMouseClicked(evt);
            }
        });
        getContentPane().add(jCarregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefone:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, -1));

        tfDataPrevisao.setBackground(new java.awt.Color(255, 255, 255));
        tfDataPrevisao.setForeground(new java.awt.Color(0, 0, 0));
        tfDataPrevisao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfDataPrevisao.setToolTipText("");
        tfDataPrevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDataPrevisaoActionPerformed(evt);
            }
        });
        getContentPane().add(tfDataPrevisao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 120, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data da Previsão:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Método Pagamento:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        tfTelefone.setBackground(new java.awt.Color(255, 255, 255));
        tfTelefone.setForeground(new java.awt.Color(0, 0, 0));
        tfTelefone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfTelefone.setToolTipText("");
        tfTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(tfTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 130, -1));

        cbStatus.setBackground(new java.awt.Color(255, 255, 255));
        cbStatus.setForeground(new java.awt.Color(0, 0, 0));
        cbStatus.setToolTipText("");
        getContentPane().add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 120, -1));

        btApagar.setBackground(new java.awt.Color(95, 46, 234));
        btApagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btApagar.setForeground(new java.awt.Color(255, 255, 255));
        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btApagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 130, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void jlVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVoltarMouseClicked
        this.dispose();
        this.homeAloneView.setVisible(true);
    }//GEN-LAST:event_jlVoltarMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        int id = (Integer) spId.getValue();
        boolean existe = false;
        MetodoPagamento metodo = null;
        
        for (Compra compra : compras) {
            if (compras.indexOf(compra) == id){
                compra.setDataEntrega(tfDataEntrega.getText());
                compra.setDataPrevisao(tfDataPrevisao.getText());
                compra.setEnderecoCompra(tfEndereco.getText());
                compra.setEmailCompra(tfEmail.getText());
                compra.setTelefoneCompra(tfTelefone.getText());
                compra.setStatus((Status) cbStatus.getSelectedItem());
                
                Orcamento orcamentoCad = (Orcamento) cbOrcamento.getSelectedItem();
                if (orcamentoCad.getValorTotal() > 0.0) {
                    
                    if (compra.getMetodoPagamento().indexOf("Cartão") > 0){
                        metodo = new Boleto("", "", "", "");
                    } else {
                        int numeroCartao = 0;
                        try {
                            numeroCartao = Integer.parseInt(compra.getMetodoPagamento().substring(
                                        compra.getMetodoPagamento().indexOf(":")+2).trim());
                            for (Cartao cartao : homeAloneView.getCartoes()) {
                                if (cartao.getNumero() == numeroCartao){
                                    metodo = new Cartao(cartao.getNumero(), 
                                                        cartao.getValidade(), 
                                                        cartao.getBandeiraCartao(),
                                                        cartao.getNumeroVerificacao());
                                    break;
                                }
                            }
                        } catch (Exception e) {}
                        if (metodo == null){
                            metodo = new Boleto("", "", "", "");
                        }
                    }
                    orcamentoCad.pagar(metodo);
                    System.out.println(metodo.toString());
                    compra.setStatus(Status.Concluida);
                    cbStatus.setSelectedItem(compra.getStatus());
                }
                compra.adicionaOrcamento(orcamentoCad);
                existe = true;
                break;
            }
        }
        
        if (!existe){
            JOptionPane.showMessageDialog(null, "Nenhum pedido encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, "Dados atualizados!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tfDataEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataEntregaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataEntregaActionPerformed

    private void tfEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEnderecoActionPerformed

    private void tfMetodoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMetodoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMetodoPagamentoActionPerformed

    private void jCarregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCarregarMouseClicked
        int id = (Integer) spId.getValue();
        boolean existe = false;
        
        for (Compra compra : this.compras) {
            if (compras.indexOf(compra) == id){
                tfDataEntrega.setText(compra.getDataEntrega());
                tfDataPrevisao.setText(compra.getDataPrevisao());
                tfMetodoPagamento.setText(compra.getMetodoPagamento());
                tfEndereco.setText(compra.getEnderecoCompra());
                tfEmail.setText(compra.getEmailCompra());
                tfTelefone.setText(compra.getTelefoneCompra());
                cbOrcamento.setSelectedItem(compra.getStatus());
                String aux = "";
                for (Produto produto : compra.getProduto()) {
                    aux = aux + produto.imprimeProduto() + System.lineSeparator();
                }
                taProdutosLista.setText(aux);
                existe = true;
                break;
            }
        }
        
        if (!existe){
            tfDataEntrega.setText("");
            tfDataPrevisao.setText("");
            tfMetodoPagamento.setText("");
            tfEndereco.setText("");
            tfEmail.setText("");
            tfTelefone.setText("");
            cbOrcamento.setSelectedItem("");
            taProdutosLista.setText("");
            JOptionPane.showMessageDialog(null, "Nenhuma pedido encontrado!");
        }
    }//GEN-LAST:event_jCarregarMouseClicked

    private void tfDataPrevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDataPrevisaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDataPrevisaoActionPerformed

    private void tfTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTelefoneActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
        int id = (Integer) spId.getValue();
        boolean deletou = false;
        
        for (Compra compra : this.compras) {
            if (compras.indexOf(compra) == id){
                this.compras.remove(compra);
                deletou = true;
                break;
            }
        }
        
        if (deletou){
            JOptionPane.showMessageDialog(null, "Pedido deletado!");
        } else {
            JOptionPane.showMessageDialog(null, "Pedido não localizado!");
        }
    }//GEN-LAST:event_btApagarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<Orcamento> cbOrcamento;
    private javax.swing.JComboBox<Status> cbStatus;
    private javax.swing.JLabel jCarregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlVoltar;
    private javax.swing.JSpinner spId;
    private javax.swing.JTextArea taProdutosLista;
    private javax.swing.JTextField tfDataEntrega;
    private javax.swing.JTextField tfDataPrevisao;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfMetodoPagamento;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
