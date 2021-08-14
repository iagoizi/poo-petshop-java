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
public class Vendedor {
    private String nome;
    private String usuario;
    private String senha;
    private double salario;
    
    
    public Cliente cadastrarCliente(String nome, String tipo_animal, String nome_pet, String endereco, long telefone, long cpf){
        /*criando um novo cliente de acordo com as informações passadas por referência*/
        Cliente cliente = new Cliente(nome, tipo_animal, nome_pet, endereco, telefone, cpf);
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        /*this->petshop->getClientes().push_back(cliente);*/
        return cliente;
    }
    
    public Produto buscarProduto(long id, boolean sucess){
        for(int i=0; i<Produto.length-1; i++){
            if(Produto[i].getId() == id){
                sucess = true;
                return Produto[i];
            }else{
                sucess = false;
                return null; /*não sei o que retornar?*/
            }
        }
        return null; /*sugerido pela porcaria do netbeans*/
    }
    
    public void listarProdutos(){
        for(Produto prod :  produto){/*ta errado*/
            System.out.println(prod.toString());
        }
    }
    
    public Servico buscarServicos(long id, boolean sucess){
        for(int i=0; i<Servico.length-1; i++){
            if(Servico[i].getId() == id){
                sucess = true;
                return Servico[i];
            }else{
                sucess = false;
                return null; /*não sei o que retornar?*/
            }
        }
        return null; /*sugerido pela porcaria do netbeans*/
    }
    
    public void listarServicos(){
        Iterable<Servico> servico = null; //n sei se ta ok
        for(Servico serv :  servico){/*ta errado*/
            System.out.println(serv.toString());
        }
    }
    
}

/*
venda de produtos
venda de serviços
*/