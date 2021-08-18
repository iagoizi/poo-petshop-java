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

    public Veterinario(PetShop petshop, String nome,  String usuario, String senha, double salario) {
        super(petshop, nome, TipoFuncionario.VETERINARIO, usuario, senha, salario);
    }

    public void registrarTratamento(OrdemServico ordem , String tratamento){
           
        Iterator <OrdemServico> itr = petshop.getOrdemServicos().iterator();        
        while (itr.hasNext()){
            OrdemServico obj = itr.next();
            if (obj.getId() == ordem.getId()){
                itr.remove();
            }
        } 
        
        ordem.setObservacao(tratamento);
        this.petshop.getHistoricoServicos().add(ordem);
    }
    
    public OrdemServico buscarOrdemServico(int id, boolean sucess){
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
    
    public void listarOrdemServico(){
        for(OrdemServico listarServicos : petshop.getOrdemServicos()){
            System.out.println(listarServicos);
        }
    }
    
    public void listarClientes(){
        for(Cliente cliente : petshop.getClientes()){
            System.out.println(cliente);
        }
    }
   
}

