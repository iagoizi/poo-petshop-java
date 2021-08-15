/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class Vendedor extends Usuario{

    public Vendedor(PetShop petshop, String nome, String usuario, String senha, double salario) {
        super(petshop, nome, TipoFuncionario.VENDEDOR, usuario, senha, salario);
    }
    
    public Cliente cadastrarCliente(String nome, String tipo_animal, String nome_pet, String endereco, long telefone, long cpf){
        /*criando um novo cliente de acordo com as informações passadas por referência*/
        Cliente cliente = new Cliente(nome, tipo_animal, nome_pet, endereco, telefone, cpf);
        petshop.getClientes().add(cliente);
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
            System.out.println(servicos.toString());
        }
    }
    
    public void vendaServico(Cliente cliente, Servico servico, Data dataServico){
        int id = 0;
        //Se o vetor não estiver vazio, passamos para o próximo id
        if (!petshop.getOrdemServicos().isEmpty())
        {
            Iterator <OrdemServico> last = petshop.getOrdemServicos().iterator();
            while (last.hasNext()){
                id = petshop.getOrdemServicos().get(petshop.getOrdemServicos().size()-1).getId() + 1;
            }
        }
        //criamos a ordem de serviço utilizando as informações presentes no vetor
        OrdemServico ordemservico = new OrdemServico(servico, cliente, dataServico, id, "");
        petshop.getOrdemServicos().add(ordemservico);
    }
}