/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.Cliente;
import Classes.OrdemServico;
import Classes.PetShop;
import java.util.Iterator;

/**
 *
 * @author iagoi
 */
public interface InterfaceVeterinario {
    

    default void registrarTratamento(PetShop petshop, OrdemServico ordem , String tratamento){
           
        Iterator <OrdemServico> itr = petshop.getOrdemServicos().iterator();        
        while (itr.hasNext()){
            OrdemServico obj = itr.next();
            if (obj.getId() == ordem.getId()){
                itr.remove();
            }
        } 
        
        ordem.setObservacao(tratamento);
        petshop.getHistoricoServicos().add(ordem);
    }
    
    default OrdemServico buscarOrdemServico(PetShop petshop, int id, boolean sucess){
        Iterator <OrdemServico> itr = petshop.getOrdemServicos().iterator();        
        while (itr.hasNext()) {
            OrdemServico obj = itr.next();
            if (obj.getId() == id) {                
                sucess = true;
                return (OrdemServico) itr;        
            }
        } 
        sucess = false;
        return null;        
    }
    
    default void listarOrdemServico(PetShop petshop){
        for(OrdemServico listarServicos : petshop.getOrdemServicos()){
            System.out.println(listarServicos);
        }
    }
    
    default void listarClientes(PetShop petshop){
        for(Cliente cliente : petshop.getClientes()){
            System.out.println(cliente);
        }
    }
   
}
