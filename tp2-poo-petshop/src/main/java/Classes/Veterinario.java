/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.Iterator;

/**
 *
 * @author danilo
 */
public class Veterinario extends Usuario{

    public Veterinario(PetShop petshop, String nome, TipoFuncionario cargo, String usuario, String senha, double salario) {
        super(petshop, nome, cargo, usuario, senha, salario);
    }

    public void registrarTratamento(OrdemServico ordem , String tratamento){
            
        Iterator <OrdemServico> itr = petshop.getOrdemServicos().iterator();        
        while (itr.hasNext()) {
            if (itr.getId() == ordem.getId()) {
                itr.remove();
            }
        } 

        ordem.setObservacao(tratamento);
        this.petshop.getHistoricoServicos().add(ordem);
    }
    
    public OrdemServico buscarOrdemServico(int id, boolean sucess){
        
        Iterator <OrdemServico> itr = petshop.getOrdemServicos().iterator();        
        while (itr.hasNext()) {
          
            if (itr.getId() == id) {                
                sucess = true;
                return (OrdemServico) itr;        
            }
        } 
        
        sucess = false;
        return null;        
    }
    
    public void listarOrdemServico(){
        
        
        for(Object listarServicos : petshop.getOrdemServico()){
            
            //System.out.printf(“”);

            //System.out.println(listarServicos);
        }
    }
    
    
    public void listarClientes(){
        for(Object cliente : petshop.getClientes()){
            System.out.println(cliente);
        }
    }
   
}

