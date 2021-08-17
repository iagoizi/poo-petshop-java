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
public class OrdemServico {

    /**
     * @return the data
     */
    
    private Servico servico;
    private Cliente cliente;
    private Data data; 
    private long id;
    private String observacao; 
     
    
    public OrdemServico (Servico servico, Cliente cliente, Data data, long id, String observacao) {
        setServico(servico);
        setCliente(cliente);
        setData(data);
        setId(id);
        setObservacao(observacao);
    }
    
    public OrdemServico (){
    }
   
    public Servico getServico (){
        return servico;
    }
    
    public Cliente getCliente (){
        return cliente;
    }
    
    public Data getData() {
        return data;
    }
    
    public String getObservacao(){
        return observacao;
    }
    
    public long getId(){
        return id;
    }
    
    public void setServico(Servico servico){
        this.servico = servico;
    }    
    
    public void setCliente (Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setData(Data data){
        this.data = data;
    }
       
    public void setObservacao (String observacao){
        this.observacao = observacao;
    }
    
    public void setId(long id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof OrdemServico)) return false;
     else{
         OrdemServico comp = (OrdemServico) obj;
         return this.id == comp.getId();
     }
    }
    
    
    
    
    @Override
    public String toString() {
        return "" + 
                this.data + "|" + this.id + "|" + 
                this.servico + "|" + this.cliente.getNome() 
                + "|" + this.observacao;
    }
    
}   
