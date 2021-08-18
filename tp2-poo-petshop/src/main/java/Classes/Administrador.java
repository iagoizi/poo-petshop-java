/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author vitor
 */
public class Administrador extends Usuario {

    public Administrador(PetShop petshop, String nome,  String usuario, String senha, double salario) {
        super(petshop, nome, TipoFuncionario.ADMINISTRADOR, usuario, senha, salario);
    }
    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void reposicaoEstoque(Produto produto, int quantidade, String descricao, double preco){
        Compra compra = new Compra(descricao, preco);
        compra.pagar();
        petshop.getCompras().add(compra);
        for(Produto produtos : petshop.getProdutos()){
            if(produtos == produto){ 
                produtos.setQuantidade(produtos.getQuantidade() + quantidade);
                if(produtos.getQuantidade() < 0){
                    produtos.setQuantidade(0);
                }
            }
        }
    }
    
    public boolean cadastrarVeterinario(String nome, String usuario, String senha, double salario){
        Veterinario veterinario = new Veterinario(petshop, nome,  usuario, senha, salario);
        if(petshop.getUsuarios().contains(veterinario)){
            return false;
        }
        petshop.getUsuarios().add(veterinario);
        return true;
    }
    
    public boolean cadastrarVendedor(String nome, String usuario, String senha, double salario){
        Vendedor vendedor = new Vendedor(petshop, nome, usuario, senha, salario);
        if(petshop.getUsuarios().contains(vendedor)){
            return false;
        }
        petshop.getUsuarios().add(vendedor);
        return true;
    }
    
    public boolean cadastrarProduto(String nome, double preco, int quantidade, long id){
        Produto produto = new Produto(nome, preco, quantidade, id);
        if(petshop.getProdutos().contains(produto)){
            return false;
        }
        petshop.getProdutos().add(produto);
        return true;
    }
    
    public boolean cadastrarServico(String nome, double preco, long id){
        Servico servico = new Servico(nome, preco, id);
        if(petshop.getServicos().contains(servico)){
            return false;
        }
        petshop.getServicos().add(servico);
        return true;
    }

    public boolean pagarConta(String descricao, Data dataVencimento, double valor){
        Conta conta = new Conta(descricao, dataVencimento, valor);
        conta.pagar();
        if(petshop.getContas().contains(conta)){
            return false;
        }
        petshop.getContas().add(conta);
        return true;
    }
    
    public void comprarEquipamentos(String equipamento, double preco, int quantidade){
        Compra compra = new Compra(equipamento, preco);
        compra.pagar();
         petshop.getCompras().add(compra);
    }
    
    public void listarFuncionarios(){
        for (int i=0; i<this.petshop.getUsuarios().size() -1; i++){
             JOptionPane.showMessageDialog(null,"Os funcionários são:" + this.petshop.getUsuarios().get(i));
        }
    }
    
    public ArrayList<Conta> listarContas(){
        return this.petshop.getContas();
    }
    
    public ArrayList<Compra> listarCompras(){
        return this.petshop.getCompras();
    }
    
    public ArrayList<Compra> listarVendas(){
        return this.petshop.getVendas();
    }
    
    public ArrayList<OrdemServico> listarOrdensServicos(){
        return this.petshop.getOrdemServicos();
    }

    public ArrayList<OrdemServico> listarHistoricoServicos(){
        return this.petshop.getHistoricoServicos();
    }
    
}
