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
public class Vendedor extends Usuario{

    public Vendedor(String nome, String usuario, String senha, double salario) {
        super(nome, 2, usuario, senha, salario);
    }

    
    
    public Cliente cadastrarCliente(String nome, String tipo_animal, String nome_pet, String endereco, long telefone, long cpf){
        /*criando um novo cliente de acordo com as informações passadas por referência*/
        Cliente cliente = new Cliente(nome, tipo_animal, nome_pet, endereco, telefone, cpf);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        /*this->petshop->getClientes().push_back(cliente);*/
        return cliente;
    }
    
    public Produto buscarProduto(long id, boolean sucess){
        for(Produto produtos: petshop.getProdutos()){
            if(produtos.getId() == id){
                sucess = true;
                return produtos;
            }
            else{
                sucess = false;
                return null;
            }
        }
        return null;
    }
    
    public void listarProdutos(){
        for(Produto produtos :  petshop.getProdutos()){
            System.out.println(produtos.toString());
        }
    }
    
    public Servico buscarServicos(long id, boolean sucess){
        for(Servico servicos: petshop.getServicos()){
            if(servicos.getId() == id){
                sucess = true;
                return servicos;
            }
            else{
                sucess = false;
                return null;
            }
        }
        return null;
    }
    
    public void listarServicos(){
        for(Servico servicos :  petshop.getServicos()){
            System.out.println(serv.toString());
        }
    }
    
}

/*
venda de produtos
venda de serviços
*/