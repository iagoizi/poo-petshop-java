/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.PetShop;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Classes.Cliente;
import Classes.Produto;
import Classes.Vendedor;
import Classes.Servico;
import Classes.Data;

/**
 *
 * @author vitor
 */
public class TelaVenderProdutosDadosComprador extends javax.swing.JFrame {
    
    PetShop petshop;
    ArrayList <Produto> carrinho;
    Servico servico;
    Data dataservico;

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaVenderProdutosDadosComprador(PetShop petshop, ArrayList <Produto> carrinho, Servico servico, Data dataservico) {
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

        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel25.setText("Insira os dados do comprador");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("CPF");

        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpf(evt);
            }
        });

        jButton1.setText("Comprar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClick(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 126, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(135, 135, 135))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(10, 10, 10)
                        .addComponent(inputCpf)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputCpf(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpf
              
    }//GEN-LAST:event_inputCpf

    private void onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClick
                
        if (inputCpf.getText().isEmpty() ) {
            JOptionPane.showMessageDialog(this, "Preencha o dado solicitado.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        long cpf = Long.parseLong(inputCpf.getText());
                       
        for( Cliente cliente : petshop.getClientes() ){
            
            if(cliente.getCpf() == cpf){
                               
                Vendedor vendedor = (Vendedor) petshop.getSessaoAtual();
                
                //Venda produto
                if(carrinho != null){
                    vendedor.vendaProduto(petshop,cliente, carrinho);
                    JOptionPane.showMessageDialog(null, "Venda concluída!");
                }
                //Venda servico
                else{
                    vendedor.vendaServico(petshop,cliente, servico, dataservico);
                    JOptionPane.showMessageDialog(null, "Serviço agendado!");
                }
                
       
            }
            else {
                JOptionPane.showMessageDialog(null, "Cliente não encontado!");
            }
            
        }                     
    }//GEN-LAST:event_onClick

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed

    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVenderProdutosDadosComprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenderProdutosDadosComprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenderProdutosDadosComprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenderProdutosDadosComprador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        PetShop petshop = new PetShop("petshop");
        ArrayList <Produto> carrinho = new ArrayList<>();
        Servico servico = new Servico();
        Data dataservico = new Data();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVenderProdutosDadosComprador(petshop, carrinho,  servico, dataservico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputCpf;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
