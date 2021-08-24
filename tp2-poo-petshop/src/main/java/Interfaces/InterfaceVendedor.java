/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Cliente;
import Classes.Compra;
import Classes.Data;
import Classes.OrdemServico;
import Classes.PetShop;
import Classes.Produto;
import Classes.Servico;
import java.util.ArrayList;

/**
 *
 * @author iagoi
 */
public interface InterfaceVendedor {

    /**
     * Cadastra um cliente adicionando-o ao vetor do petshop.
     * @return Sucesso: Cliente. Falha: null.
     */
    default Cliente cadastrarCliente(PetShop petshop, String nome, String tipo_animal, String nome_pet, String endereco, long telefone, long cpf) {
        /*criando um novo cliente de acordo com as informações passadas por referência*/
        Cliente cliente = new Cliente(nome, tipo_animal, nome_pet, endereco, telefone, cpf);
        if (petshop.getClientes().contains(cliente)) {
            return null;
        }
        /*adicionando o cliente no vetor de clientes*/
        petshop.getClientes().add(cliente);
        return cliente;
    }

     /**
     * Busca um produto já cadastrado
     * @return Sucesso: Produto. Falha: null.
     */
    default Produto buscarProduto(PetShop petshop, long id) {
        for (Produto produtos : petshop.getProdutos()) {
            if (produtos.getId() == id) {
                return produtos;
            } 
        }
        return null;
    }
    
    /*realiza a listagem dos produtos*/
    default void listarProdutos(PetShop petshop) {
        /*percorre o vetor de produtos e realiza a impressão em seguida*/
        for (Produto produtos : petshop.getProdutos()) {
            System.out.println(produtos.toString());
        }
    }
    
    /*procura um determinado serviço e realiza o retorno deste por meio da função*/
    default Servico buscarServicos(PetShop petshop, long id) {
        /*percorre o vetor e faz comparações por meio do if*/
        for (Servico servicos : petshop.getServicos()) {
            if (servicos.getId() == id) {
                return servicos;
            }
        }
        return null;
    }
    
    /*realiza a listagem de todos os serviços*/
    default void listarServicos(PetShop petshop) {
        /*percorre o vetor de serviços e faz a impressão dos dados*/
        for (Servico servicos : petshop.getServicos()) {
            System.out.println(servicos.toString());
        }
    }

    /*método responsável por realizar a venda de um determinado serviço*/
    default void vendaServico(PetShop petshop, Cliente cliente, Servico servico, Data dataServico) {
        long id = 0;
        //Se o vetor não estiver vazio, passamos para o próximo id
        if (!petshop.getOrdemServicos().isEmpty()) {
            id = petshop.getOrdemServicos().get(petshop.getOrdemServicos().size() - 1).getId() + 1;
        }
        //criamos a ordem de serviço utilizando as informações presentes no vetor
        OrdemServico ordemservico = new OrdemServico(servico, cliente, dataServico, id, "");
        //adicionamos a ordem de serviço no vetor de ordens do petshop
        petshop.getOrdemServicos().add(ordemservico);
    }
    
    /*método responsável por realizar a venda de um determinado produto*/
    default void vendaProduto(PetShop petshop, Cliente cliente, ArrayList<Produto> carrinho) {

        String descricaoCompra = "";
        double preco = 0.0;
        //percorre a lista de produtos
        for (Produto produto : carrinho) {
            descricaoCompra += produto.getQuantidade() + "x " + produto.getNome() + " (R$ " + produto.getPreco() + " cada)";
            if (produto.getId() != carrinho.get(carrinho.size() - 1).getId()) {
                descricaoCompra += ", ";
            }

            preco += produto.getPreco() * produto.getQuantidade();
            //faz com que a venda aconteça
            for (Produto produtoEstoque : petshop.getProdutos()) {
                if (produto.equals(produtoEstoque)) {
                    produtoEstoque.setQuantidade(produtoEstoque.getQuantidade() - produto.getQuantidade());
                    if (produtoEstoque.getQuantidade() < 0) {
                        produtoEstoque.setQuantidade(0);
                    }
                }
            }
        }
        //cria uma nova compra com as informações presentes acima
        Compra venda = new Compra(descricaoCompra, preco);
        //faz o pagamento
        venda.pagar();
        //adiciona a venda no vetor de vendas do petshop
        petshop.getVendas().add(venda);
        //verifica se o cliente existe
        for (Cliente clientes : petshop.getClientes()) {
            if (cliente.equals(clientes)) {
                clientes.getCompras().add(venda);
            }
        }
    }
}
