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
        Veterinario veterinario = new Veterinario(petshop, nome,  usuario, senha, salario);
        petshop.getUsuarios().add(veterinario);
    }
    
    public void cadastrarVendedor(String nome, String usuario, String senha, double salario){
        Vendedor vendedor = new Vendedor(petshop, nome, usuario, senha, salario);
        petshop.getUsuarios().add(vendedor);
    }
    
    public void cadastrarProduto(String nome, double preco, int quantidade, long id){
        Produto produto = new Produto(nome, preco, quantidade, id);
        petshop.getProdutos().add(produto);
    }
    
    public void cadastrarServico(String nome, double preco, long id){
        Servico servico = new Servico(nome, preco, id);
        petshop.getServicos().add(servico);
    }

    public void pagarConta(String descricao, Data dataVencimento, double valor){
        Conta conta = new Conta(descricao, dataVencimento, valor);
        conta.pagar();
        petshop.getContas().add(conta);
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

}

/*
reposição de estoque
*/