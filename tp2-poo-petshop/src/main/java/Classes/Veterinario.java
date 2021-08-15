/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author danilo
 */
public class Veterinario extends Usuario{

    public Veterinario(String nome, String usuario, String senha, double salario) {
        super(nome, 1, usuario, senha, salario);
    }
    
    public void registrarTratamento(OrdemServico ordem , String tratamento){
        
       List <OrdemServico> list = new ArrayList();
        for (Iterator <OrdemServico> iterator = list.iterator(); iterator.hasNext();) {
          Object obj = iterator.next();
            if (obj.equals("1")) {

               System.out.printf("Removendo");
               iterator.remove();
            }
        }

        ordem.setObservacao(tratamento);
        //petshop->getHistoricoServico().add(ordem);
        
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

