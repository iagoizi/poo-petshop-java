/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interfaces.InterfaceVendedor;
import Interfaces.InterfaceVeterinario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author vitor
 */
public class Administrador extends Usuario implements InterfaceVendedor, InterfaceVeterinario{
    
    /*criando o construtor da classe*/
    public Administrador(PetShop petshop, String nome,  String usuario, String senha, double salario) {
        super(petshop, nome, TipoFuncionario.ADMINISTRADOR, usuario, senha, salario);
    }
    
    /*função responsável por realizar a reposição do estoque*/
    public void reposicaoEstoque(Produto produto, int quantidade, String descricao, double preco){
        //cria uma nova compra
        Compra compra = new Compra(descricao, preco);
        //faz o pagamento da compra
        compra.pagar();
        //adiciona a compra no vetor de compras
        petshop.getCompras().add(compra);
        //percorre o vetor de produtos
        for(Produto produtos : petshop.getProdutos()){
            //verifica se o produto passado por referência é igual a algum produto do vetor
            if(produtos == produto){ 
                //sendo igual, faz as devidas alterações
                produtos.setQuantidade(produtos.getQuantidade() + quantidade);
                if(produtos.getQuantidade() < 0){
                    produtos.setQuantidade(0);
                }
            }
        }
    }
    
    /*método responsável por realizar o cadastro de algum veterinário*/
    public boolean cadastrarVeterinario(String nome, String usuario, String senha, double salario){
        //cria um novo veterinário utilizando os dados passados por referência
        Veterinario veterinario = new Veterinario(petshop, nome,  usuario, senha, salario);
        //verifica se existe um usuário com esses dados
        if(petshop.getUsuarios().contains(veterinario)){
            return false;
        }
        //caso não exista, faz a adicição no vetor em petshop
        petshop.getUsuarios().add(veterinario);
        return true;
    }
    
    /*método responsável por realizar o cadastro de algum vendedor*/
    public boolean cadastrarVendedor(String nome, String usuario, String senha, double salario){
        //cria um novo veterinário utilizando os dados passados por referência
        Vendedor vendedor = new Vendedor(petshop, nome, usuario, senha, salario);
        //verifica se existe um usuário com esses dados
        if(petshop.getUsuarios().contains(vendedor)){
            return false;
        }
        //caso não exista, faz a adicição no vetor em petshop
        petshop.getUsuarios().add(vendedor);
        return true;
    }
    
    /*método responsável por realizar o cadastro de algum produto*/
    public boolean cadastrarProduto(String nome, double preco, int quantidade, long id){
        //cria um novo produto utilizando os dados passados por referência
        Produto produto = new Produto(nome, preco, quantidade, id);
        //verifica se existe um produto com esses dados
        if(petshop.getProdutos().contains(produto)){
            return false;
        }
        //caso não exista, faz a adicição no vetor de produtos em petshop
        petshop.getProdutos().add(produto);
        return true;
    }
    
    /*método responsável por realizar o cadastro de algum serviço*/
    public boolean cadastrarServico(String nome, double preco, long id){
        //cria um novo serviço utilizando os dados passados por referência
        Servico servico = new Servico(nome, preco, id);
        //verifica se existe um serviço com esses dados
        if(petshop.getServicos().contains(servico)){
            return false;
        }
        //caso não exista, faz a adicição no vetor de serviços em petshop
        petshop.getServicos().add(servico);
        return true;
    }

    /*método responsável por realizar o pagamento de contas*/
    public boolean pagarConta(String descricao, Data dataVencimento, double valor){
        //cria uma nova conta
        Conta conta = new Conta(descricao, dataVencimento, valor);
        //faz o pagamento da conta
        conta.pagar();
        //compara os dados para ver se existe alguma conta com essas informações
        if(petshop.getContas().contains(conta)){
            return false;
        }
        //caso não exista, faz a adicição no vetor de contas em petshop
        petshop.getContas().add(conta);
        return true;
    }
    
    /*realiza a compra de um equipamento qualquer*/
    public void comprarEquipamentos(String equipamento, double preco, int quantidade){
        //instancia os dados de um objeto
        Compra compra = new Compra(equipamento, preco);
        //faz o pagamento da compra
        compra.pagar();
        //adiciona no vetor de compras
        petshop.getCompras().add(compra);
    }
    
    /*faz a listagem de todos os funcionários cadastrados no sistema*/
    public void listarFuncionarios(){
        //percorre o vetor de usuários e realiza a listagem das informações
        for (int i=0; i<this.petshop.getUsuarios().size() -1; i++){
             JOptionPane.showMessageDialog(null,"Os funcionários são:" + this.petshop.getUsuarios().get(i));
        }
    }
    
    /*realiza a listagem das informações*/
    public ArrayList<Conta> listarContas(){
        return this.petshop.getContas();
    }
    
    /*realiza a listagem das informações*/
    public ArrayList<Compra> listarCompras(){
        return this.petshop.getCompras();
    }
    
    /*realiza a listagem das informações*/
    public ArrayList<Compra> listarVendas(){
        return this.petshop.getVendas();
    }

    /*realiza a listagem das informações*/
    public ArrayList<OrdemServico> listarHistoricoServicos(){
        return this.petshop.getHistoricoServicos();
    }
    
}
