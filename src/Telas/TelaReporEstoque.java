/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Compra;
import Classes.Lib;
import Classes.PetShop;
import Classes.Produto;

import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class TelaReporEstoque extends javax.swing.JFrame {
    
    PetShop petshop;
    /**
     * Creates new form TelaCadastroCliente
     */
    
    public TelaReporEstoque(PetShop petshop) {
        initComponents();
        this.petshop = petshop;
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
        inputListarProdutos = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        inputPrecoAquisicao = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        inputDescricao = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        inputListarProdutos.setText("Listar Produtos");
        inputListarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputListarProdutosActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Reposição de estoque");

        jButton2.setText("Repor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClick(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Em qual item a reposição será realizada?");

        inputPrecoAquisicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPrecoAquisicao(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Preço de aquisição");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("ID");

        inputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputId(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Quantidade");

        inputDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputDescricao(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Descrição");

        inputQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantidade(evt);
            }
        });

        botaoVoltar.setText("Voltar");
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(171, 171, 171))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(102, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(104, 104, 104))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputListarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputDescricao)
                            .addComponent(inputPrecoAquisicao, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputId)
                            .addComponent(inputQuantidade))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(inputListarProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(inputPrecoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(inputDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputListarProdutosActionPerformed(java.awt.event.ActionEvent evt) {                                                                        
        petshop.irPara(new TelaDeProdutos(petshop)); 
    }                                                   

    private void onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClick
        
        if (inputId.getText().isEmpty() || inputDescricao.getText().isEmpty() || inputPrecoAquisicao.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(this, "Preencha todos os dados", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
        }
        
        else if(petshop.getProdutos().isEmpty()){
            JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            return;           
        }

        else{
                long id = Long.parseLong(inputId.getText());
                double preco = Double.parseDouble(inputPrecoAquisicao.getText());
                int quantidade = Integer.parseInt(inputQuantidade.getText());
                String descricao = inputDescricao.getText();
                
            if(id < 0 || preco < 0 || quantidade < 0){
                JOptionPane.showMessageDialog(this, "Preencha com dados válidos", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            else{                               
                Compra compra = new Compra(descricao, preco);
                compra.pagar();
                petshop.getCompras().add(compra);
                
                for(Produto produto : petshop.getProdutos()){

                    if(produto.getId() == id){
                        produto.setQuantidade(produto.getQuantidade() + quantidade);
                        if(produto.getQuantidade() < 0){
                            produto.setQuantidade(0);
                        }
                        JOptionPane.showMessageDialog(this,  "Reposição de produto concluída!");
                        return;
                    }

                    else{
                        JOptionPane.showMessageDialog(this, "Id não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }
            }
        }
    }//GEN-LAST:event_onClick

    private void inputPrecoAquisicao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPrecoAquisicao
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPrecoAquisicao

    private void inputId(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputId
        // TODO add your handling code here:
    }//GEN-LAST:event_inputId

    private void inputDescricao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputDescricao
        // TODO add your handling code here:
    }//GEN-LAST:event_inputDescricao

    private void inputQuantidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantidade
        // TODO add your handling code here:
    }//GEN-LAST:event_inputQuantidade

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        petshop.voltar();
    }//GEN-LAST:event_botaoVoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JTextField inputId;
    private javax.swing.JButton inputListarProdutos;
    private javax.swing.JTextField inputPrecoAquisicao;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
