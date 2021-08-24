/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Cliente;
import Classes.OrdemServico;
import Classes.PetShop;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author iagoi
 */
public interface InterfaceVeterinario {
    
    //método que registra o tratamento
    default boolean registrarTratamento(PetShop petshop, OrdemServico ordem, String tratamento) {
        if(ordem == null) return false;
        boolean sucesso = false;
        Iterator<OrdemServico> itr = petshop.getOrdemServicos().iterator();
        while (itr.hasNext()) {
            OrdemServico obj = itr.next();
            //remove essa ordem de serviço do vetor de ordens de serviço
            if (obj.getId() == ordem.getId()) {
                itr.remove();
                sucesso = true;
            }
        }        
        if (sucesso) {
            //adiciona a observação a ordem
            ordem.setObservacao(tratamento);
            //adiciona essa ordem no vetor de historico
            petshop.getHistoricoServicos().add(ordem);
        }
        return sucesso;
    }
    
    //permite a busca de uma ordem de serviço
    default OrdemServico buscarOrdemServico(PetShop petshop, long id) {
        //recebe o vetor de ordens de servico
        Iterator<OrdemServico> itr = petshop.getOrdemServicos().iterator();
        while (itr.hasNext()) {
            OrdemServico obj = itr.next();
            //comparação com id para verificar se a ordem pesquisada existe
            if (obj.getId() == id) {
                //quando a ordem é encontrada ela é retornada
                return obj;
            }
        }
        return null;
    }
    //método que permite a listagem dos clientes
    default void listarClientes(PetShop petshop) {
        //for que percorre o vetor que armazena todos os clientes
        for (Cliente cliente : petshop.getClientes()) {
            System.out.println(cliente);
        }
    }
    
    //lista as ordens de serviço
    default ArrayList<OrdemServico> listarOrdensServicos(PetShop petshop){
        //retorna o vetor que contem as ordens de serviço
        return petshop.getOrdemServicos();
    }

}
