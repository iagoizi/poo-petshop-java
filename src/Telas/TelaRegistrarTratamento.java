/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Administrador;
import Classes.Lib;
import Classes.OrdemServico;
import Classes.PetShop;
import Classes.TipoFuncionario;
import Classes.Veterinario;
import Model.ModeloTabelaOrdemServico;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class TelaRegistrarTratamento extends javax.swing.JFrame {
    
    private PetShop petshop;
    
    ModeloTabelaOrdemServico modeloTabelaOrdens;

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaRegistrarTratamento(PetShop petshop) {
        initComponents();
        this.petshop = petshop;
        this.modeloTabelaOrdens = new ModeloTabelaOrdemServico(false);
        tabelaOrdens.setModel(modeloTabelaOrdens);
        //Se o usuário for administrador ou veterinário...
        if (petshop.getSessaoAtual().getCargo() == TipoFuncionario.ADMINISTRADOR || petshop.getSessaoAtual().getCargo() == TipoFuncionario.VETERINARIO) {
            this.modeloTabelaOrdens.setListaOrdens(
                    (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VETERINARIO
                            ? ((Veterinario) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).listarOrdensServicos(petshop));
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

        botaoRegistrar = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        inputID = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        inputDescricao = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaOrdens = new javax.swing.JTable();
        botaoVoltar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoRegistrar.setText("Registrar");
        botaoRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRegistrarActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("ID");

        inputID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Descrição");

        inputDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDescricaoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Registrar tratamento");

        tabelaOrdens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabelaOrdens);

        botaoVoltar2.setText("Voltar");
        botaoVoltar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputID)
                                    .addComponent(inputDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoVoltar2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botaoRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(inputID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botaoVoltar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botaoRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRegistrarActionPerformed
        // TODO add your handling code here:
        if (inputDescricao.getText().isEmpty() || inputID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String tratamento = inputDescricao.getText();
        long id = Long.parseLong(inputID.getText());
        
        if (petshop.getSessaoAtual().getCargo() == TipoFuncionario.ADMINISTRADOR || petshop.getSessaoAtual().getCargo() == TipoFuncionario.VETERINARIO) {
            OrdemServico ordem = (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VETERINARIO
                    ? ((Veterinario) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).buscarOrdemServico(petshop, id);
            
            boolean sucesso = (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VETERINARIO
                    ? ((Veterinario) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).registrarTratamento(petshop, ordem, tratamento);
            
            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Tratamento registrado com sucesso", "Concluir", JOptionPane.INFORMATION_MESSAGE);
                this.modeloTabelaOrdens = new ModeloTabelaOrdemServico(false);
                tabelaOrdens.setModel(this.modeloTabelaOrdens);
                this.modeloTabelaOrdens.setListaOrdens(petshop.getOrdemServicos());
            } else {
                JOptionPane.showMessageDialog(this, "Não foi possível registrar o tratamento", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            inputDescricao.setText("");
            inputID.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Acesso negado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoRegistrarActionPerformed

    private void inputIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDActionPerformed

    private void inputDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescricaoActionPerformed

    private void botaoVoltar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar2MouseClicked
        petshop.voltar();
    }//GEN-LAST:event_botaoVoltar2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRegistrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton botaoVoltar1;
    private javax.swing.JButton botaoVoltar2;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JTextField inputID;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaOrdens;
    // End of variables declaration//GEN-END:variables
}