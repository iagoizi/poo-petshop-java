/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import Classes.Administrador;
import Classes.Cliente;
import Classes.Lib;
import Classes.PetShop;
import Classes.TipoFuncionario;
import Classes.Vendedor;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class TelaCadastroCliente extends javax.swing.JFrame {

    private PetShop petshop;
    private boolean apenasUmCadastro;

    /**
     * Creates new form TelaCadastroCliente
     */
    public TelaCadastroCliente(PetShop petshop, boolean apenasUmCadastro) {
        initComponents();
        this.apenasUmCadastro = apenasUmCadastro;
        this.petshop = petshop;
        botaoVoltar.setEnabled(!apenasUmCadastro);
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
        botaoCadastrar = new javax.swing.JButton();
        labelNome = new javax.swing.JLabel();
        inputNome = new javax.swing.JTextField();
        labelEndereco = new javax.swing.JLabel();
        inputEndereco = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        inputTelefone = new javax.swing.JTextField();
        labelCpf = new javax.swing.JLabel();
        inputCpf = new javax.swing.JTextField();
        tituloTela = new javax.swing.JLabel();
        labelTipoPet = new javax.swing.JLabel();
        inputTipoPet = new javax.swing.JTextField();
        labelNomePet = new javax.swing.JLabel();
        inputNomePet = new javax.swing.JTextField();
        labelObservacao = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNome.setText("Nome");

        inputNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeActionPerformed(evt);
            }
        });

        labelEndereco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelEndereco.setText("Endereço");

        inputEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputEnderecoActionPerformed(evt);
            }
        });

        labelTelefone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTelefone.setText("Telefone*");

        inputTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTelefoneActionPerformed(evt);
            }
        });

        labelCpf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelCpf.setText("CPF*");

        inputCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCpfActionPerformed(evt);
            }
        });

        tituloTela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tituloTela.setText("Cadastro de Clientes");

        labelTipoPet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelTipoPet.setText("Tipo do Pet");

        inputTipoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTipoPetActionPerformed(evt);
            }
        });

        labelNomePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        labelNomePet.setText("Nome do Pet");

        inputNomePet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomePetActionPerformed(evt);
            }
        });

        labelObservacao.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        labelObservacao.setText("*Apenas números");

        botaoVoltar.setText("Voltar");
        botaoVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltarMouseClicked(evt);
            }
        });
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
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
                        .addComponent(botaoVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipoPet)
                            .addComponent(labelNomePet))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputNomePet)
                            .addComponent(inputTipoPet)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEndereco)
                            .addComponent(labelNome)
                            .addComponent(labelTelefone)
                            .addComponent(labelCpf))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEndereco, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputCpf)
                            .addComponent(inputNome))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(tituloTela)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tituloTela, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNome)
                            .addComponent(inputNome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelEndereco)
                            .addComponent(inputEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTelefone)
                            .addComponent(inputTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCpf)
                            .addComponent(inputCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNomePet)
                            .addComponent(inputNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTipoPet)
                            .addComponent(inputTipoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelObservacao)))
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void inputNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeActionPerformed

    private void inputEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputEnderecoActionPerformed

    private void inputTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTelefoneActionPerformed

    private void inputCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCpfActionPerformed

    private void inputTipoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTipoPetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTipoPetActionPerformed

    private void inputNomePetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomePetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomePetActionPerformed

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
        if (inputNome.getText().isEmpty() || inputCpf.getText().isEmpty() || inputEndereco.getText().isEmpty() || inputNomePet.getText().isEmpty() || inputTelefone.getText().isEmpty() || inputTipoPet.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os dados", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Se o usuário for administrador ou vendedor...
        if (petshop.getSessaoAtual().getCargo() == TipoFuncionario.ADMINISTRADOR || petshop.getSessaoAtual().getCargo() == TipoFuncionario.VENDEDOR) {

            String nome = inputNome.getText();
            String tipoPet = inputTipoPet.getText();
            String nomePet = inputNomePet.getText();
            String endereco = inputEndereco.getText();
            long telefone = Long.parseLong(inputTelefone.getText());
            long cpf = Long.parseLong(inputCpf.getText());
            TipoFuncionario cargo = petshop.getSessaoAtual().getCargo();
            //Fazendo o casting para o tipo adequado de usuário
            Cliente clienteCadastrado
                    = (cargo == TipoFuncionario.VENDEDOR
                            ? ((Vendedor) petshop.getSessaoAtual()) : (Administrador) petshop.getSessaoAtual())
                            .cadastrarCliente(petshop, nome, tipoPet, nomePet, endereco, telefone, cpf);
            if (clienteCadastrado != null) {
                JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                if(apenasUmCadastro){
                    petshop.voltar();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Cliente já cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            inputNome.setText("");
            inputCpf.setText("");
            inputEndereco.setText("");
            inputNomePet.setText("");
            inputTelefone.setText("");
            inputTipoPet.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Acesso negado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botaoCadastrarMouseClicked

    private void botaoVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltarMouseClicked
        petshop.voltar();
    }//GEN-LAST:event_botaoVoltarMouseClicked

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputEndereco;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputNomePet;
    private javax.swing.JTextField inputTelefone;
    private javax.swing.JTextField inputTipoPet;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JLabel labelEndereco;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelNomePet;
    private javax.swing.JLabel labelObservacao;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTipoPet;
    private javax.swing.JLabel tituloTela;
    // End of variables declaration//GEN-END:variables
}
