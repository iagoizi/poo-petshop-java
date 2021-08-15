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
public class Administrador {
    private String nome;
    private String cargo;
    
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

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /*public void reposicaoEstoque(Produto produto, int quantidade, String descricao, double preco){
        Compra compra = new Compra(descricao, preco);
        compra.pagar();
        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(compra);
        //criar arraylist de compras
        //this->petshop->getCompras().push_back(compra);
        //getCompras().push_back(compra);
    }*/
    
    public void cadastrarVeterinario(String nome, String usuario, String senha, double salario){
        Veterinario veterinario = new Veterinario(/*this->petshop,*/ nome,  usuario, senha, salario);
        ArrayList<Veterinario> veterinarios = new ArrayList<>();
        veterinarios.add(veterinario);
        /*this->petshop->getUsuarios().push_back(veterinario);*/
        //getUsuarios().add(veterinario);
    }
    
    public void cadastrarVendedor(String nome, String usuario, String senha, double salario){
        Vendedor vendedor = new Vendedor(nome, usuario, senha, salario);
        ArrayList<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor);
        /*this->petshop->getUsuarios().push_back(vendedor);*/
        //getUsuarios().add(vendedor);
    }
    
    public void cadastrarProduto(String nome, double preco, int quantidade, long id){
        Produto produto = new Produto(/*this->petshop,*/ nome, preco, quantidade, id);
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        /*this->petshop->getUsuarios().push_back(produto);*/
        //getUsuarios().add(produto);
    }
    
    public void cadastrarServico(String nome, double preco, long id){
        Servico servico = new Servico(nome, preco, id);
        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(servico);
        /*this->petshop->getServicos().push_back(servico);*/
        //getServicos().add(servico);
    }

    public void pagarConta(String descricao, Data dataVencimento, double valor){
        Conta conta = new Conta(descricao, dataVencimento, valor);
        conta.pagar();
        ArrayList<Conta> contas = new ArrayList<>();
        contas.add(conta);
        /*this->petshop->getContas().push_back(conta);*/
        //getContas().add(conta);
    }
    
    public void comprarEquipamentos(String equipamento, double preco, int quantidade){
        Compra compra = new Compra(equipamento, preco);
        compra.pagar();
        ArrayList<Compra> compras = new ArrayList<>();
        compras.add(compra);
        /*this->petshop->getCompras().push_back(compra);*/
        //getCompras().add(compra);
    }
    
    public void listarFuncionarios(){
        for (int i=0; i<petshop.getUsuarios().size -1; i++){
             JOptionPane.showMessageDialog(null,"Os funcionários são:" + petshop[i].getUsuarios());
        }
    }

}

/*
gerar relatório
reposição de estoque
*/