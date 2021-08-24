/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Administrador;
import Classes.Cliente;
import Classes.Compra;
import Classes.OrdemServico;
import Classes.PetShop;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import Classes.Produto;
import Classes.TipoFuncionario;
import Classes.Vendedor;
import Classes.Veterinario;
import javax.swing.JFrame;

import java.util.Scanner;
import java.lang.Thread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class TelaVenderProdutos extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroCliente
     */
    private PetShop petshop;
    ArrayList<Produto> carrinho;
    private boolean estaEsperando;

    public TelaVenderProdutos(PetShop petshop, ArrayList<Produto> carrinho) {
        initComponents();
        this.carrinho = new ArrayList<>();
        this.petshop = petshop;
        estaEsperando = false;
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
        inputListarProduto = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        inputQuantidade = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        inputId = new javax.swing.JTextField();
        botaoVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        inputListarProduto.setText("Listar Produtos");
        inputListarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputListarProdutoActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setText("Vender Produtos");

        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onClick(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setText("Deseja realizar a compra de algum item?");

        inputQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantidadeActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Quantidade");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("ID");

        inputId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdActionPerformed(evt);
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
                .addContainerGap(144, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(inputListarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel23)))
                        .addGap(0, 198, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputQuantidade)
                            .addComponent(inputId))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(inputListarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(inputQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputListarProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        petshop.irPara(new TelaDeProdutos(petshop));
    }

    private void onClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onClick
        //Pegar o id e a quantidade e ir para TelaVenderProdutosComprador
        Cliente cliente;

        if (inputId.getText().isEmpty() || inputQuantidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (petshop.getProdutos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nenhum produto cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            long id = Long.parseLong(inputId.getText());
            int quantidade = Integer.parseInt(inputQuantidade.getText());

            if (id < 0 || quantidade < 0) {
                JOptionPane.showMessageDialog(this, "Preencha com dados válidos", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } else {
                //Arraylist também é classe e esta sendo inicializado

                if (petshop.getSessaoAtual().getCargo() == TipoFuncionario.ADMINISTRADOR || petshop.getSessaoAtual().getCargo() == TipoFuncionario.VENDEDOR) {

                    Produto produto = (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VENDEDOR
                            ? ((Vendedor) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).buscarProduto(petshop, id);

                    if (produto != null && id == produto.getId()) {

                        //Caso não tenha o produto em estoque
                        if (produto.getQuantidade() == 0) {
                            JOptionPane.showMessageDialog(null, "Não temos produto em estoque!");
                        } //Caso tenha a quantidade para compra
                        else if (produto.getQuantidade() >= quantidade) {

                            Produto compra = new Produto(produto.getNome(), produto.getPreco(), quantidade, id);
                            carrinho.add(compra);

                            //Para continuar comprando
                            String message = "Deseja comprar outro produto?";
                            String title = "Confirmação";
                            int resposta = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                            if (resposta == JOptionPane.NO_OPTION) {

                                message = "O comprador possui cadastro?";
                                title = "Confirmação";
                                resposta = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                                if (resposta == JOptionPane.YES_OPTION) {

                                    String msg = JOptionPane.showInputDialog("Digite o CPF: ");
                                    int cpf = Integer.parseInt(msg);

                                    cliente = petshop.getSessaoAtual().buscarCadastro(cpf);

                                    if (cliente != null) {
                                        (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VENDEDOR
                                                ? ((Vendedor) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).vendaProduto(petshop, cliente, carrinho);

                                        JOptionPane.showMessageDialog(null, "Venda concluída!");
                                        carrinho.clear();
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Cliente não encontado!");
                                    }
                                } else {
                                    message = "Deseja cadastrar um novo cliente?";
                                    title = "Confirmação";
                                    resposta = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
                                    //Se ele quiser cadastrar o cliente, vamos para a tela de cadastro.      
                                    if (resposta == JOptionPane.YES_OPTION) {
                                        petshop.irPara(new TelaCadastroCliente(petshop, true));
                                        //A finalização da compra vai acontecer quando a tela voltar a aparecer (listener de "component shown").
                                        estaEsperando = true;
                                    } else {//Venda do produto sem cadastro do cliente
                                        Cliente clienteDesconhecido = new Cliente();
                                        (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VENDEDOR
                                                ? ((Vendedor) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).vendaProduto(petshop, clienteDesconhecido, carrinho);
                                        JOptionPane.showMessageDialog(null, "Venda concluída!");
                                        carrinho.clear();
                                    }

                                }
                            }
                        } //Caso a quantidade solicitada seja maior que do estoque
                        else {
                            JOptionPane.showMessageDialog(null, "A quantidade em estoque está abaixo da solicitada!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Produto inexiste!");
                    }
                }
            }

            inputId.setText("");
            inputQuantidade.setText("");
        }
    }//GEN-LAST:event_onClick

    private void inputQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputQuantidadeActionPerformed

    private void inputIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdActionPerformed

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        petshop.voltar();
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        if (estaEsperando) {
            estaEsperando = false;
            Cliente cliente = petshop.getClientes().get(petshop.getClientes().size() - 1);
            (petshop.getSessaoAtual().getCargo() == TipoFuncionario.VENDEDOR
                    ? ((Vendedor) petshop.getSessaoAtual()) : ((Administrador) petshop.getSessaoAtual())).vendaProduto(petshop, cliente, carrinho);
            JOptionPane.showMessageDialog(null, "Venda concluída!");
            carrinho.clear();
        }
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField inputId;
    private javax.swing.JButton inputListarProduto;
    private javax.swing.JTextField inputQuantidade;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
