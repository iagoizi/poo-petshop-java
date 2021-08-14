/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Classes.Lib;
import Classes.OrdemServico;

/**
 *
 * @author danilo
 */
public class Veterinario {
     /*private PetShop petshop; */
    private String nome;
    private String cargo;
    private String usuario;
    private String senha;
    private double salario;

    public Veterinario(/* PetShop PetShop ,*/ String nome, String cargo, String usuario, senha nome, double salario){
    }
    
     
    public Veterinario() {
    }
    
    
    public void registrarTratamento(/*OrdemServico &ordem */, String tratamento){
        
        //usar hasNext()
        for (ArrayList <OrdemServico> i = this->petshop->getOrdemServico().begin();i < this->petshop->getOrdemServico().end().i++)
        {  
            if (*it == ordem)
            {
                System.out.printf("Removendo");
                //Remove a ordem de servico
                this->petshop->getOrdemServico().remove(i);
                //this->petshop->getOrdemServico().delete(i);
            }
        }
    }
    
    public OrdemServico buscarOrdemServico(int id, bool sucess){
        
// Laço que passa pelos Id das ordens de servico para encontrar a buscada
        for (ArrayList <OrdemServico> i = this->petshop->getOrdemServico().begin(); i != this->petshop->getOrdemServico().end(); i++)
        {
            //Condição que verifica se é o ID buscado
            if ((i).getId() == id)
            {
                sucess = true;
                return i;
            }
        }

        //Caso não seja encontrado a ordem buscado
        sucess = false;
        return {};
        
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

