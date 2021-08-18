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

    default boolean registrarTratamento(PetShop petshop, OrdemServico ordem, String tratamento) {
        if(ordem == null) return false;
        boolean sucesso = false;
        Iterator<OrdemServico> itr = petshop.getOrdemServicos().iterator();
        while (itr.hasNext()) {
            OrdemServico obj = itr.next();
            if (obj.getId() == ordem.getId()) {
                itr.remove();
                sucesso = true;
            }
        }
        if (sucesso) {
            ordem.setObservacao(tratamento);
            petshop.getHistoricoServicos().add(ordem);
        }
        return sucesso;
    }

    default OrdemServico buscarOrdemServico(PetShop petshop, long id) {
        Iterator<OrdemServico> itr = petshop.getOrdemServicos().iterator();
        while (itr.hasNext()) {
            OrdemServico obj = itr.next();
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null;
    }

    default void listarOrdemServico(PetShop petshop) {
        for (OrdemServico listarServicos : petshop.getOrdemServicos()) {
            System.out.println(listarServicos);
        }
    }

    default void listarClientes(PetShop petshop) {
        for (Cliente cliente : petshop.getClientes()) {
            System.out.println(cliente);
        }
    }
    
    default ArrayList<OrdemServico> listarOrdensServicos(PetShop petshop){
        return petshop.getOrdemServicos();
    }

}
