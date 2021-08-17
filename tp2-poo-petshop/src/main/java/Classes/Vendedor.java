

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
    
    public void vendaProduto(Cliente cliente, ArrayList <Produto> carrinho){
        
        String descricaoCompra;
        double preco = 0.0;
         
        Iterator <Produto> it;
        while (it.hasNext()){
            
            Produto p = it.next();
       
            String precoString = Integer.toString(p.getPreco()) + Integer.toString((p.getPreco() - (p.getPreco()) * 100));
             
            descricaoCompra += Integer.toString(p.getQuantidade()) + "x " + p.getNome() + " (R$ + precoString + cada)";
             
            
            if(p.getId() != carrinho.getId(size() -1.getId()) ){
                
            descricaoCompra += ", ";
            }
            
            preco += it.getPreco() * it.getQuantidade();
            
            Iterator <Produto> produtoEstoque;
            while (produtoEstoque.hasNext()) {
                Produto pAux = produtoEstoque.next();
                
                if(p == pAux){
                    produtoEstoque.setQuantidade(produtoEstoque.getQuantidade() - it.getQuantidade());
                    if(produtoEstoque.getQuantidade() < 0){
                        produtoEstoque.setQuantidade(0);
                    }
                }
                
            }     
        } 
        
        Compra venda = Compra(descricaoCompra, preco);
        
        venda.pagar();
        
        this.petshop.getVendas().add(venda);
        
        
        Iterator <Cliente> itr;
        while (itr.hasNext()) {
            Cliente c = itr.next();
            
            if(c == cliente){
                
                c.getCompras().add(venda);
            }
            
        }
        
        
        
        
        
        
        
    }
}